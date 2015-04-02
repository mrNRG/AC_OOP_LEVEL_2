package Homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 10;
        Employee[] employees = new Employee[arraySize];
        Company bigCompany = new Company("ART-CODE",new Address("Ukraine","Kiev","Starokievskaia",10),arraySize,employees);
        Employee employee1 = new Employee("Igor",1500,new Address("Ukraine","Kiev","Nezhynskaia",29),"male",21,"01-01-2013");
        bigCompany.addEmployee(employee1);
        bigCompany.addEmployee(new Employee("Artem",2500,new Address("Ukraine","Kiev","Khreshchatyk",2),"male",22,"01-12-2010"));
        bigCompany.addEmployee(new Employee("Viktoria",900,new Address("Ukraine","Kiev","Harmatnaia",53),"female",20,"01-01-2015"));
        bigCompany.addEmployee(new Employee("Yaroslav",1000,new Address("Ukraine","Kiev","Nezhynskaia",29),"male",21,"01-03-2014"));



        System.out.println("1. Read about company");
        System.out.println("2. View list of employees");
        System.out.println("3. View employees, which work more than year");
        System.out.println("4. View employees, which are girls and live in Kiev");
        System.out.println("5. Add an employee");
        System.out.println("6. Fire an employee");
        System.out.println("7*. Fire an employee, with salary less then 1000 and which works less then year");
        System.out.println("8*. Change an employee information");
        System.out.println("9*. View list of employees: first women and then men");
        System.out.println("10*. Employee has a hire date");
        System.out.println("11*. View employees, which works between 100 and 200 hours");
        System.out.println("0. Quit");
        boolean quit = false;
        int menuItem;
        do {
            System.out.println("Chose menu item: ");
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    bigCompany.showInfo();
                    break;
                case 2:
                    bigCompany.showAllEmployees();
                    break;
                case 3:
                    bigCompany.showSomeEmployees();
                    break;
                case 4:
                    bigCompany.showOtherEmployees();
                    break;
                case 5:
                    System.out.println("Entering a new Employee! Please, enter all variables in the model:");
                    System.out.println("Name, salary, address: country, city, street, building, sex, age, date format: 01-01-2015");
                    Employee employee = new Employee(sc.next(),sc.nextInt(),new Address(sc.next(),sc.next(),sc.next(),sc.nextInt()),sc.next(),sc.nextInt(),sc.next());
                    bigCompany.addEmployee(employee);
                    break;
                case 6:
                    System.out.println("Please, enter number of employee to fire: ");
                    bigCompany.fireEmployee(employees,sc.nextInt());
                    break;
                case 7:
                    bigCompany.fireBadEmployee(employees);
                    break;
                case 8:
                    System.out.println("You've chosen item #8");
                    break;
                case 9:
                    bigCompany.showSortedEmployes();
                    break;
                case 10:
                    System.out.println("You've chosen item #10");
                    break;
                case 11:
                    System.out.println("You've chosen item #11");
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
