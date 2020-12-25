package com.nw.se.webserver.frontmicrosrv;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nw.se.webserver.authmicrosrv.AuthEngine;
import com.nw.se.webserver.authmicrosrv.Constants;
import com.nw.se.webserver.authmicrosrv.Transaction;
import com.nw.se.webserver.usermicrosrv.PhoneNumber;
import com.nw.se.webserver.usermicrosrv.User;

import com.nw.se.webserver.usermicrosrv.UsersDB;
import org.apache.tomcat.util.bcel.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class FrontController {

    public static final Logger logger= LoggerFactory.getLogger(FrontController.class);

    @RequestMapping(path = FrontRoutes.FORM_PATH, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @ResponseBody
    public String getForm() {
        logger.info("Landing page reached");
        return "ok";
    }

    @RequestMapping(path = FrontRoutes.AUTH_PATH, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    //public String doAPost(@RequestBody String body)  {
    public ModelAndView doAPost(@RequestBody String body)  {

        if (body == null)
            logger.error("no data received");

        Gson gsonGrossTransactionData = new GsonBuilder().setPrettyPrinting().create();
        FrontData frontData = gsonGrossTransactionData.fromJson(body, FrontData.class);

        //find internal user id
        //for now, user constructor allows to retrieved id for John Actor
        //could be anythin like hash(email)? collisions?, etc
        //get id for user in AuthData -- will be replaced by a rest API call
        //later need a way to get id from form data
        User user = new User(frontData.name);



        logger.error(gsonGrossTransactionData.toJson(frontData));

        // whnen i have the internal id,
        // I  need to get the phone number
        //UsersDB db = new UsersDB();// this should be an api call to the DB


        //send transact to auth service
        //creates transaction for user id, with state 1 and some transac id is created
        Transaction tr = new Transaction(frontData,user.getId());
        AuthEngine authEngine = new AuthEngine(tr);

        tr.setState(Constants.STATE_PENDING);
        if (authEngine.checkCardDetails() !=0){
            tr.setState(Constants.STATE_REFUSED);
            logger.error("INVALID_CARD");
            return new ModelAndView("redirect:/generic-error.html");
            //return String.valueOf(new Integer(Constants.STATE_REFUSED));
        }

        if (authEngine.checkTransaction()!=0){
            tr.setState(Constants.STATE_REFUSED);
            logger.error("NO_MONEY");
            return new ModelAndView("redirect:/hello.html");
            //return String.valueOf(new Integer(Constants.STATE_REFUSED));
        }

        if (authEngine.processAuth(user) !=0){
            tr.setState(Constants.STATE_REFUSED);
            logger.error("SOMETHING WENT WRONG");
            return new ModelAndView("redirect:/error.html");
            //return "Auth did not process";
        }


        logger.error("OTP "+ authEngine.getOtpData().getOTP()+ " should be sent to "+ authEngine.getOtpData().getPn().toString());
        logger.error("We should open an html page with a field for OTP to be entered");

        return new ModelAndView("redirect:/otp.html");
        //return "ok";
    }
}
