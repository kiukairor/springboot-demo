package com.nw.se.webserver.data.unused;


import java.util.Objects;

public class Client {

    private String name;
    private String email;
    private Adress deliveryAddress;
    private String phone;

    public Client(String name, Adress deliveryAddress, String phone) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.phone = phone;
    }

    
    
    public Client() {

    }

    public Client(String name, Adress deliveryAddress) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
    }

    public class Adress {
            private String street1;
            private String street2;
            private String town;
            private String county;
            private String country;
            private String postcode;


        public String getStreet1() {
            return street1;
        }

        public void setStreet1(String street1) {
            this.street1 = street1;
        }

        public String getStreet2() {
            return street2;
        }

        public void setStreet2(String street2) {
            this.street2 = street2;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "street1='" + street1 + '\'' +
                    ", street2='" + street2 + '\'' +
                    ", town='" + town + '\'' +
                    ", county='" + county + '\'' +
                    ", country='" + country + '\'' +
                    ", postcode='" + postcode + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Adress adress = (Adress) o;
            return Objects.equals(street1, adress.street1) &&
                    Objects.equals(street2, adress.street2) &&
                    Objects.equals(town, adress.town) &&
                    Objects.equals(county, adress.county) &&
                    Objects.equals(country, adress.country) &&
                    Objects.equals(postcode, adress.postcode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(street1, street2, town, county, country, postcode);
        }
    }

    @Override
    public String toString() {
        return "IdClient{" +
                "name='" + name + '\'' +
                ", deliveryAddress=" + deliveryAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(email, client.email) &&
                Objects.equals(deliveryAddress, client.deliveryAddress) &&
                Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, deliveryAddress, phone);
    }
}
