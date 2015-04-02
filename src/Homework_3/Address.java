package Homework_3;

import java.io.Serializable;

public class Address implements Serializable{
    private String country;
    private String city;
    private String street;
    private int building;

    public Address() {
    }

    public Address(String country, String city, String street, int building) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public void showAll() {
        System.out.println("Address: " + country + ", " + city
                + ", " + street + " street"
                + ", " + building);
    }


}
