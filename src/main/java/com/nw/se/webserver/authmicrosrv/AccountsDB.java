package com.nw.se.webserver.authmicrosrv;

import com.nw.se.webserver.usermicrosrv.PhoneNumber;
import com.nw.se.webserver.usermicrosrv.User;
import com.nw.se.webserver.usermicrosrv.UsersDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class AccountsDB {

    public static final Logger logger= LoggerFactory.getLogger(UsersDB.class);
    private static HashMap<Integer, AccountInfo> accounts;

    //SELECT id from DB to get AccountInfo
    public AccountsDB(int id) {
        HashMap<Integer ,AccountInfo> accounts = new HashMap<Integer ,AccountInfo>();
        AccountInfo ai = new AccountInfo(id);
        accounts.put(id, ai);
        this.accounts=accounts;

    }

    public static HashMap<Integer, AccountInfo> getAccounts() {
        return accounts;
    }

    public static void setAccounts(HashMap<Integer, AccountInfo> accounts) {
        AccountsDB.accounts = accounts;
    }

    @Override
    public String toString() {
        return "AccountsDB{}";
    }

}
