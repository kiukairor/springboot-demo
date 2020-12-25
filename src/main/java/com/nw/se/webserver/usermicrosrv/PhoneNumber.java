package com.nw.se.webserver.usermicrosrv;

import java.util.Objects;

public class PhoneNumber {
    String value;

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "value='" + value + '\'' +
                '}';
    }

    public PhoneNumber() {
        this.value = "077777777";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
