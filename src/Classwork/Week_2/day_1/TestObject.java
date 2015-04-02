package Classwork.Week_2.day_1;

import Classwork.Week_2.day_1.company.Developer;

public class TestObject {

    public static void main(String[] args) {

        Object o = new Object();
        Developer developer = new Developer();

        String s = developer.toString();

        Developer developer1 = new Developer();

        System.out.println(developer.equals(developer1));
        System.out.println(s);
    }
}
