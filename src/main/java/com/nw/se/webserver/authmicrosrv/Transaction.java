package com.nw.se.webserver.authmicrosrv;

import com.nw.se.webserver.frontmicrosrv.FrontData;

import java.util.Objects;

public class Transaction {
    FrontData frontData;
    int user_id;
    int transaction_id;
    int state; //1=created,2=pending,3=accepted,4=refused
    int authFactor; //0=phone = OTP SMS



    public Transaction(FrontData frontData, int user_id) {
        this.frontData = frontData;
        this.user_id=user_id;
        this.transaction_id=1000;
        this.state = 1;
        this.authFactor = 0;
    }

    public int getUser_id() {
        return user_id;
    }

    public FrontData getFrontData() {
        return frontData;
    }

    public void setFrontData(FrontData frontData) {
        this.frontData = frontData;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getAuthFactor() {
        return authFactor;
    }

    public void setAuthFactor(int authFactor) {
        this.authFactor = authFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return user_id == that.user_id &&
                transaction_id == that.transaction_id &&
                state == that.state &&
                authFactor == that.authFactor &&
                Objects.equals(frontData, that.frontData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontData, user_id, transaction_id, state, authFactor);
    }
}
