package Classwork.Week_3.Day_2.Immutable;

public class TestNumber {

    public static void main(String[] args) {
        MyNumber n1 = new MyNumber(3);
        MyNumber n2 = new MyNumber(7);

        n1.add(n2);

        System.out.println(n1);

//    n1.setValue(15);

//    System.out.println(n1);

        n1 = n1.add(n2);

        System.out.println(n1);

//    System.out.printf("%.2f", Math.PI);

        System.out.println(0.02 + 0.1);



    }
}
