package com.nw.se.webserver.usermicrosrv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class UsersDB {
    public static final Logger logger= LoggerFactory.getLogger(UsersDB.class);
    private static HashMap<User,PhoneNumber> users;

    public UsersDB() {
        HashMap<User,PhoneNumber> localUsers = new HashMap<User,PhoneNumber>();
        User zero= new User("John Actor", 0);
        PhoneNumber pn = new PhoneNumber();
        localUsers.put(zero, pn);
        this.users=localUsers;

    }

    public static HashMap<User, PhoneNumber> getUsers() {
        return users;
    }

    public static void setUsers(HashMap<User, PhoneNumber> users) {
        UsersDB.users = users;
    }


}
