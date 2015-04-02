package Classwork.Week_2.day_1.company;

public abstract class ITSpecialist {

    public String name;
    public int age;
    public int salary;

    public ITSpecialist() {
    }

    public ITSpecialist(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract void work();
}