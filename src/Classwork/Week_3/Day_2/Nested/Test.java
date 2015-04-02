package Classwork.Week_3.Day_2.Nested;

public class Test {

    public static void main(String[] args) {


        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.method(10);

        Outer.Nested nested = new Outer.Nested();
//        nested.method();
    }
}