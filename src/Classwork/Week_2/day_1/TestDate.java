package Classwork.Week_2.day_1;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date();

        long time = date.getTime();
        System.out.println("date = " + time);

        Date date1 = new Date();
        System.out.println("date1 = " + time);


        if (date1.getTime() > date.getTime()) {
            System.out.println("Date 1 later");
        } else {
            System.out.println("date 2 latest");
        }
    }

}
