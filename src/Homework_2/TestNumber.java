package Homework_2;

public class TestNumber {
    public static void main(String[] args) {
        Number n = new Number(5);
        Number n1 = new Number(2);
        Object n2 = new Number(10);

        System.out.println(n2);

//        System.out.println(n.powNumber(n, n1).getValue());
//        System.out.println(n1.getValue());
//        n.factorialNumber();
//        System.out.println(n.reminderNumber(n1).getValue());
        n.addNumber(n1);
        System.out.println(n.equals(n1));
    }
}
