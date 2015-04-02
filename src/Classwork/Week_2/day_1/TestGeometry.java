package Classwork.Week_2.day_1;

import Classwork.Week_2.day_1.geometry.Circle;
import Classwork.Week_2.day_1.geometry.Romb;
import Classwork.Week_2.day_1.geometry.Square;
import Classwork.Week_2.day_1.geometry.Triangle;
import Classwork.Week_2.day_1.geometry.Figure;

public class TestGeometry {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(5);

        double s = square.square();
        System.out.println(s);

        int a = 4;
        long d = a;

        Circle circle = new Circle();
        circle.setRadius(5);

        Triangle t = new Triangle();
        System.out.println(calculateSqure(circle));

        Romb romb = new Romb();
        System.out.println("Romb square = " + calculateSqure(romb));


    }

    public static double calculateSqure(Square square) {
        return square.square();
    }

    public static double calculateSqure(Figure figure) {
        return figure.square();
    }

}
