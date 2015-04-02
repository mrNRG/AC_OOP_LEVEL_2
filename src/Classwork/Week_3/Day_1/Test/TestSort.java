package Classwork.Week_3.Day_1.Test;

import Classwork.Week_3.Day_1.Task.Apple;
import Classwork.Week_3.Day_1.Task.AppleComparator;
import helper.VarHelper;

import java.util.Arrays;
import java.util.Comparator;

public class TestSort {

    public static void main(String[] args) {
        Apple[] apples = new Apple[5];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple(VarHelper.random(5),"Gold");
            apples[i].setPrice(VarHelper.random(10));
        }
        System.out.println(Arrays.toString(apples));
        Arrays.sort(apples, new AppleComparator());
        System.out.println(Arrays.toString(apples));
    }


    public class MyComparator implements Comparator<Apple> {

        @Override
        public int compare(Apple o1, Apple o2) {
            return 0;
        }
    }

}
