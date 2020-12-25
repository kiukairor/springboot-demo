package com.nw.se.webserver.frontmicrosrv;


import com.nw.se.webserver.data.unused.CardData;
import java.util.Arrays;
import java.util.Objects;

public class FrontData {

    String name;
    String pan;
    String cvv;
    CardData.Expiry[] expiry;
    String amt;
    CardData.Address[] address;
    String merID;
    String merCC;
    String countrycode;
    String timestamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public CardData.Expiry[] getExpiry() {
        return expiry;
    }

    public void setExpiry(CardData.Expiry[] expiry) {
        this.expiry = expiry;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public CardData.Address[] getAddress() {
        return address;
    }

    public void setAddress(CardData.Address[] address) {
        this.address = address;
    }

    public String getMerID() {
        return merID;
    }

    public void setMerID(String merID) {
        this.merID = merID;
    }

    public String getMerCC() {
        return merCC;
    }

    public void setMerCC(String merCC) {
        this.merCC = merCC;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrontData frontData = (FrontData) o;
        return Objects.equals(name, frontData.name) &&
                Objects.equals(pan, frontData.pan) &&
                Objects.equals(cvv, frontData.cvv) &&
                Arrays.equals(expiry, frontData.expiry) &&
                Objects.equals(amt, frontData.amt) &&
                Arrays.equals(address, frontData.address) &&
                Objects.equals(merID, frontData.merID) &&
                Objects.equals(merCC, frontData.merCC) &&
                Objects.equals(countrycode, frontData.countrycode) &&
                Objects.equals(timestamp, frontData.timestamp);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, pan, cvv, amt, merID, merCC, countrycode, timestamp);
        result = 31 * result + Arrays.hashCode(expiry);
        result = 31 * result + Arrays.hashCode(address);
        return result;
    }

    @Override
    public String toString() {
        return "GrossTransactionData{" +
                "name='" + name + '\'' +
                ", pan='" + pan + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiry=" + Arrays.toString(expiry) +
                ", amt='" + amt + '\'' +
                ", address=" + Arrays.toString(address) +
                ", merID='" + merID + '\'' +
                ", merCC='" + merCC + '\'' +
                ", CountryCode='" + countrycode + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
