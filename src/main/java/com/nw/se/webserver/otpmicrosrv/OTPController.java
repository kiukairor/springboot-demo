package com.nw.se.webserver.otpmicrosrv;

import com.nw.se.webserver.frontmicrosrv.FrontController;
import com.nw.se.webserver.frontmicrosrv.FrontRoutes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class OTPController {

    public static final Logger logger= LoggerFactory.getLogger(OTPController.class);

    @RequestMapping(path = FrontRoutes.OTP_PATH, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @ResponseBody
    public String getOTPValidation() {
        logger.info("Landing page reached");

        return "ok OTPOTP";
    }

    @RequestMapping(path = FrontRoutes.OTP_PATH, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    public String postOTPValidation(@RequestBody String otp) {

        OTPEngine otpEngine = new OTPEngine();
        logger.error("Received :" + otp);
        int r = otpEngine.check(0,otp);
        logger.error("Should the transcation be validated :" + r);
        return "ok ok";
    }

}
