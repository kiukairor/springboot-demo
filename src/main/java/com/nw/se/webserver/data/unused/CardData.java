package com.nw.se.webserver.data.unused;

public class CardData {

    String PAN;
    String CVV;
    Expiry expiry;
    Address address;
    String CountryCode;


    public class Address {
        String str1;
        String str2;
        String town;
        String county;
        String country;
        String postcode;

        @Override
        public String toString() {
            return "Address{" +
                    "street1='" + str1 + '\'' +
                    ", street2='" + str2 + '\'' +
                    ", town='" + town + '\'' +
                    ", county='" + county + '\'' +
                    ", country='" + country + '\'' +
                    ", postcode='" + postcode + '\'' +
                    '}';
        }
    }


    public class Expiry {
        String expmon;
        String expyea;

        @Override
        public String
        toString() {
            return "Expiry{" +
                    "expmon='" + expmon + '\'' +
                    ", expyea='" + expyea + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CardData{" +
                "PAN='" + PAN + '\'' +
                ", CVV='" + CVV + '\'' +
                ", expiry=" + expiry +
                ", address=" + address +
                ", CountryCode='" + CountryCode + '\'' +
                '}';
    }
}
