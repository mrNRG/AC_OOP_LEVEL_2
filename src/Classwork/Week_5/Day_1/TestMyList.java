package Classwork.Week_5.Day_1;

import java.util.List;

public class TestMyList {
    public static void main(String[] args) {
        List list = new MyList(4);

        Object o = new Integer(43);
        list.add(0);
        list.add(10);
        list.add(1);
        list.add(3);
        list.add(43);
//        list.set(3,11);
//        list.add(3,10);
//        list.remove(2);
//        list.clear();
        System.out.println(list.toString());
        list.remove(4);
//        System.out.println(list.get(1));
//        System.out.println(list.isEmpty());
//        System.out.println(list.indexOf(11));
        list.clear();
//        List myList = list.subList(1,4);
//        System.out.println(myList.toString());
        System.out.println(list.toString());
    }
}
