package com.nw.se.webserver.authmicrosrv;

import com.nw.se.webserver.otpmicrosrv.OTPData;
import com.nw.se.webserver.otpmicrosrv.OTPEngine;
import com.nw.se.webserver.usermicrosrv.PhoneNumber;
import com.nw.se.webserver.usermicrosrv.User;
import com.nw.se.webserver.usermicrosrv.UsersDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AuthEngine {

    private static final Logger logger = LogManager.getLogger(AuthEngine.class);
    Transaction tr;
    OTPData otpData;

    public AuthEngine(Transaction tr) {
        this.tr = tr;
    }

    public int checkCardDetails() {

        //check card Details
        return 0;
    }


    public int checkTransaction(){
        //check if user_id has enough money
        int id = tr.getUser_id();
        AccountsDB accounts = new AccountsDB(id);
        AccountInfo acc = accounts.getAccounts().get(id);

        int c = checkCardDetails();
        if (c !=0){
            logger.error("Invalid CARD");
            return -1;
        }


        if (Float.parseFloat(tr.getFrontData().getAmt()) > acc.getBalance()){
            logger.error("Not Enough money");
            return -1;
        }

        return 0;
    }

    public int processAuth(User user){

        //contact OTP GENERATOR
        //send to OTP Generator Microservice
        OTPEngine otpEngine = new OTPEngine(this.tr);
        PhoneNumber pn = otpEngine.getPhoneNumber(user);
        String otp = otpEngine.generateOTP();

        logger.error("OTP = " + otp + "\n sent to "+pn);
        this.otpData = new OTPData(pn,otp);

        return 0;
    }

    public Transaction getTr() {
        return tr;
    }

    public void setTr(Transaction tr) {
        this.tr = tr;
    }

    public OTPData getOtpData() {
        return otpData;
    }

    public void setOtpData(OTPData otpData) {
        this.otpData = otpData;
    }
}
