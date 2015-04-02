package Homework_3;

public class Administrator extends Employee {
    private static final String ADMIN_LOGIN = "admin";
    ServiceCenter serviceCenter;

    public Administrator() {}

    public Administrator(String name, int salary, Address address, String sex, int age, String employmentDate) {
        super(name, salary, address, sex, age, employmentDate);
    }
}
