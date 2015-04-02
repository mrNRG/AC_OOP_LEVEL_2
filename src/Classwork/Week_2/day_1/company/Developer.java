package Classwork.Week_2.day_1.company;

public class Developer extends ITSpecialist{

    private int numberOfLanguages;

    public int getNumberOfLanguages() {
        return numberOfLanguages;
    }

    public void setNumberOfLanguages(int numberOfLanguages) {
        this.numberOfLanguages = numberOfLanguages;
    }

    public void work(){
        System.out.println("I am writing a code ");
    }

    public String toString() {
        return name + " number of languages = " + numberOfLanguages;
    }
}