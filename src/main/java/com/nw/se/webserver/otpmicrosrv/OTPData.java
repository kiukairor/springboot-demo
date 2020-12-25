package com.nw.se.webserver.otpmicrosrv;

import com.nw.se.webserver.usermicrosrv.PhoneNumber;

public class OTPData {
    PhoneNumber pn;
    public String OTP;

    public OTPData(PhoneNumber pn, String OTP) {
        this.pn = pn;
        this.OTP = OTP;
    }

    public PhoneNumber getPn() {
        return pn;
    }

    public void setPn(PhoneNumber pn) {
        this.pn = pn;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    @Override
    public String toString() {
        return "OTPData{" +
                "pn=" + pn +
                ", OTP='" + OTP + '\'' +
                '}';
    }
}
