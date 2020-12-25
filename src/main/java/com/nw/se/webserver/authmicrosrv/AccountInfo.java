package com.nw.se.webserver.authmicrosrv;

import com.nw.se.webserver.data.unused.Client;
import com.nw.se.webserver.usermicrosrv.PhoneNumber;

import java.util.Objects;

public class AccountInfo {

    public int id;
    public String name;
    public PhoneNumber pn;
    public Client.Adress address;
    float balance;


    public AccountInfo(int id) {
        this.id = id;
        this.name="John Actor";
        this.pn = new PhoneNumber();
        this.balance=1000;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber getPn() {
        return pn;
    }

    public void setPn(PhoneNumber pn) {
        this.pn = pn;
    }

    public Client.Adress getAddress() {
        return address;
    }

    public void setAddress(Client.Adress address) {
        this.address = address;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountInfo that = (AccountInfo) o;
        return id == that.id &&
                balance == that.balance &&
                Objects.equals(name, that.name) &&
                Objects.equals(pn, that.pn) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pn, address, balance);
    }
}
