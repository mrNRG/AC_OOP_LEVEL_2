package Classwork.Week_1.day_2;

public class TestAddress {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Kiev");
        address.setStreet("OldKievskaya");
        address.setHouse(10);
        address.setFlat(214);

        Student s = new Student();
        s.setAddress(new Address("Kiev","Starokievskaia",10,214));
        s.getAddress().showAll();
    }

}