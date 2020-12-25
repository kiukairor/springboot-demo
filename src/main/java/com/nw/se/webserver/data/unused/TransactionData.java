package com.nw.se.webserver.data.unused;

import com.nw.se.webserver.usermicrosrv.User;

public class TransactionData {


    private User User;
    private CardData cardData;
    private MerchData merchData;
    private String amt;
    private String timestamp;

    public User getIdClient() {
        return User;
    }

    public void setIdClient(User User) {
        this.User = User;
    }

    public CardData getCardData() {
        return cardData;
    }

    public void setCardData(CardData cardData) {
        this.cardData = cardData;
    }

    public MerchData getMerchData() {
        return merchData;
    }

    public void setMerchData(MerchData merchData) {
        this.merchData = merchData;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "TransactionData{" +
                "idClient=" + User +
                ", cardData=" + cardData +
                ", merchData=" + merchData +
                ", amt='" + amt + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}

