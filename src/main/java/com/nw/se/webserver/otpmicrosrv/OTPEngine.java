package com.nw.se.webserver.otpmicrosrv;

import com.nw.se.webserver.authmicrosrv.Transaction;
import com.nw.se.webserver.usermicrosrv.PhoneNumber;
import com.nw.se.webserver.usermicrosrv.User;
import com.nw.se.webserver.usermicrosrv.UsersDB;

public class OTPEngine {

    private int id;
    private Transaction tr;
    private String otp;

    //OTP generator should generate an OTP based on the transaction and update the transaction state

    public OTPEngine() {
        this.otp = "12345";
        this.id=0;
    }

    public OTPEngine(Transaction tr) {
        this.tr = tr;
        this.otp = "12345";
        this.id=tr.getUser_id();
    }

    public PhoneNumber getPhoneNumber(User user){
        UsersDB users = new UsersDB();
        PhoneNumber pn = users.getUsers().get(user);

        return pn;
    }

    public String generateOTP(){
        return "12345";
    }

    public int check(int id, String otpVal){
        System.out.println("fdp");
        System.out.println(otpVal);
        System.out.println(this.otp);

        if (id == this.id && otpVal.equals(this.otp)){
            return 0;
        }

        return -1;
    }

}
