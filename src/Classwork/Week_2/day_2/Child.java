package Classwork.Week_2.day_2;

public class Child extends Parent{

    int childField;

    public Child() {
        super();
        System.out.println("In child constructor");
    }


    public void childMethod() {
        super.parentMethod();
    }
}