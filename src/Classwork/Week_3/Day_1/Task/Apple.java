package Classwork.Week_3.Day_1.Task;

public class Apple implements Comparable<Apple> {
    private double weightAppple;
    private String verietyApple;
    private int price;


    public Apple() {
    }

    public Apple(double weightAppple, String verietyApple) {
        this.weightAppple = weightAppple;
        this.verietyApple = verietyApple;
    }

    public double getWeightAppple() {
        return weightAppple;
    }

    public void setWeightAppple(double weightAppple) {
        this.weightAppple = weightAppple;
    }

    public String getVerietyApple() {
        return verietyApple;
    }

    public void setVerietyApple(String verietyApple) {
        this.verietyApple = verietyApple;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void bubbleSort(Apple[] apples) {
        for (int i = 0; i < apples.length - 1; i++) {
            for (int j = 0; j < apples.length - 1 - i; j++) {
                if (apples[j].compareTo(apples[j + 1]) > 0) {
                    swap(apples, j, j + 1);
                }
            }
        }
    }

    public static void swap(Apple[] array, int i, int j) {
        Apple c = array[j];
        array[j] = array[i];
        array[i] = c;
    }


    @Override
    public int compareTo(Apple apple) {
//        return weightAppple > apple.weightAppple ? 1: weightAppple < apple.weightAppple ? -1: 0;
        int result = 0;
        if (weightAppple > apple.weightAppple) {
            result = 1;
        }
        if (weightAppple < apple.weightAppple) {
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weightAppple=" + weightAppple +
                ", verietyApple='" + verietyApple + '\'' +
                '}';
    }

}
