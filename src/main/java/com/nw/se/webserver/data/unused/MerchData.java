package com.nw.se.webserver.data.unused;

public class MerchData {

    String merId;
    String merCC;

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getMerCC() {
        return merCC;
    }

    public void setMerCC(String merCC) {
        this.merCC = merCC;
    }

    @Override
    public String toString() {
        return "MerchData{" +
                "merId='" + merId + '\'' +
                ", merCC='" + merCC + '\'' +
                '}';
    }
}
