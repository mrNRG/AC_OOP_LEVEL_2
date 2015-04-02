package Homework_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        boolean quit = false;
        int menuItem;
        do {
            System.out.println("Chose menu item: ");
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println(new Number(sc.nextDouble()).addNumber(new Number(sc.nextDouble())).getValue());
                    break;
                case 2:
                    System.out.println(new Number(sc.nextDouble()).diffNumber(new Number(sc.nextDouble())).getValue());
                    break;
                case 3:
                    System.out.println(new Number(sc.nextDouble()).multNumber(new Number(sc.nextDouble())).getValue());
                    break;
                case 4:
                    System.out.println(new Number(sc.nextDouble()).divNumber(new Number(sc.nextDouble())).getValue());
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (!quit);
        System.out.println("Bye-bye!");
        sc.close();


    }
}
