package Classwork.Week_3.Day_1.Task;


public class TestApple {
    public static void main(String[] args) {
        Apple apple1 = new Apple(10, "Gold");
        Apple apple2 = new Apple(15, "Gold");

        Apple[] apples = new Apple[5];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple(Math.random() * 20, "Gold");
            System.out.println(apples[i]);
        }

        System.out.println("\n");
        sort(apples);
        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i]);
        }

//        System.out.println(apple1.compareTo(apple2));
    }

    public static void sort(Comparable[] objects) {
        for (int i = 0; i < objects.length - 1; i++) {
            for (int j = 0; j < objects.length - 1 - i; j++) {
                if (objects[j].compareTo(objects[j + 1]) > 0) {
                    Comparable tmp = objects[j];
                    objects[j] = objects[j+1];
                    objects[j+1] = tmp;
                }
            }
        }
    }

}
