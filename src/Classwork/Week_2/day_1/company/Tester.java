package Classwork.Week_2.day_1.company;

public class Tester extends ITSpecialist {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void work() {
        System.out.println("Testing code");
    }
}