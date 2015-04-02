package Classwork.Week_1.day_2;

public class Address {

    private String city;
    private String street;
    private int house;
    private int flat;

    public Address() {
    }

    public Address(String city, String street, int house, int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
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

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void showAll() {
        System.out.println("Address: " + city + " city"
                + ", " + street + " street"
                + ", house: " + house
                + ", flat №" + flat);
    }
}
