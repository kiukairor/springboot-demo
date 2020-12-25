package com.nw.se.webserver.usermicrosrv;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

import static com.nw.se.webserver.usermicrosrv.UserRoutes.HELLO;
import static com.nw.se.webserver.usermicrosrv.UserRoutes.USERS_PATH;

@RestController
@RequestMapping("/")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    //@GetMapping("/fdp")
    @GetMapping(USERS_PATH)
    public String doGetUsers() {

        logger.error("FDPFDPFDPFDPFDPFDPFDPFDPFDPFDP");
        ModelAndView ret=new ModelAndView();
        return "ret string";
    }


    @PostMapping(USERS_PATH)
    public ModelAndView doPostUsers(@RequestBody String body) {
        logger.error("AaAAAAAAAAAAAAAAAA"+ body);
        return new ModelAndView(UserRoutes.HELLO_REDIRECT);
    }

//    @PostMapping("/fdp")
//    public ModelAndView doPostUsers(@RequestBody String body) {
//        logger.error("AaAAAAAAAAAAAAAAAA"+ body);
//        return new ModelAndView(UserRoutes.HELLO_REDIRECT);
//    }
}



