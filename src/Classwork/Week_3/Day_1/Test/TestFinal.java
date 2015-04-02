package Classwork.Week_3.Day_1.Test;

import Homework_2.Number;

public class TestFinal {

    public static final int TEST = 4;

    public static void main(String[] args) {
        final int a = 5;

        final Homework_2.Number number = new Number(5);

        number.setValue(13);

        System.out.println(number);
        System.out.println(TEST);
    }
}
