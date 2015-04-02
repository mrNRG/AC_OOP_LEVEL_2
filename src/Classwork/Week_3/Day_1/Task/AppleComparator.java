package Classwork.Week_3.Day_1.Task;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {


    @Override
    public int compare(Apple o1, Apple o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        }
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        return 0;
    }
}
