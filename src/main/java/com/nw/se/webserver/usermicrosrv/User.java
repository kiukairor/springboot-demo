package com.nw.se.webserver.usermicrosrv;


import java.util.Objects;

public class User {

    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //propose real way to generate an id form html form
    public User(String name) {
        this.name = name;
        if (name.equals("John Actor")){
            this.id=0;
        }
        else{
            this.id=-1;
        }
    }


    @Override
    public String toString() {
        return "DBUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}'+"\n"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
