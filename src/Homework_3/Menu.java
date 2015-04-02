package Homework_3;

import java.util.Scanner;

public class Menu {
    public Menu(ServiceCenter serviceCenter, Director director) {
        this.serviceCenter = serviceCenter;
        this.director = director;
    }

    private Scanner sc = new Scanner(System.in);
    ServiceCenter serviceCenter;
    Director director;
    private void printMainMenu() {
        System.out.println("\n1. Директор");
        System.out.println("2. Администратор");
        System.out.println("3. Специалист по ремонту");
        System.out.println("4. Клиент");
        System.out.println("\n0. Выход");
    }
    private void printDirectorMenu() {
        System.out.println("\n1. Сменить место расположение СЦ");
        System.out.println("2. Нанять сотрудника");
        System.out.println("3. Уволить сотрудника");
        System.out.println("4. Посмотреть всех сотрудников");
        System.out.println("5. Платить налоги");
        System.out.println("6. Увеличить зарплату сотрудникам на 10%");
        System.out.println("7. Выдать з/п сотрудникам");
        System.out.println("8. Посмотреть финансы СЦ");
        System.out.println("\n0. Back");
    }
    private void printAdminMenu() {
        System.out.println("\n1. Посмотреть всех клиентов");
        System.out.println("2. Показать отчет(количество отремонтированной техники за день, за неделю, за месяц)");
        System.out.println("3. Взять на ремонт технику (цена ремонта = 10% от суммы товара)");
        System.out.println("4. Передать технику специалисту по ремонту");
        System.out.println("5. Отдать отремонтированный товар клиенту");
        System.out.println("\n0. Назад");
    }
    private void printSpecRepairMenu() {
        System.out.println("\n1. Ремонтировать");
        System.out.println("2. Возврат отремонтированной техники администратору");
        System.out.println("\n0. Назад");
    }
    private void printClientMenu() {
        System.out.println("\n1. Купить технику");
        System.out.println("2. Сдать товар на ремонт");
        System.out.println("3. Забрать товар по идентификационному коду");
        System.out.println("\n0. Назад");
    }


    public void startMenu() {
        printMainMenu();
        boolean quit = false;
        int menuItem;
        do {
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    menuDirector();
                    break;
                case 2:
                    menuAdmin();
                    break;
                case 3:
                    menuSpecRepair();
                    break;
                case 4:
                    menuClient();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        } while (!quit);
        System.out.println("До свидания!");
        sc.close();

    }
    private void menuDirector() {
        printDirectorMenu();
        boolean quit = false;
        int menuItem;
        do {
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("Введите страну");
                    String country = sc.next();
                    System.out.println("Введите город");
                    String city = sc.next();
                    System.out.println("Введите название улицы");
                    String street = sc.next();
                    System.out.println("Введите номер дома");
                    int building = sc.nextInt();
                    director.setScAddress(new Address(country,city,street,building));
                    printDirectorMenu();
                    break;
                case 2:
                    System.out.println("Введите имя сотрудника");
                    String name = sc.next();
                    System.out.println("Размер з/п");
                    int salary = sc.nextInt();
                    System.out.println("Введите адрес:");
                    System.out.println("страна");
                    country = sc.next();
                    System.out.println("город");
                    city = sc.next();
                    System.out.println("улица");
                    street = sc.next();
                    System.out.println("номер дома");
                    building = sc.nextInt();
                    System.out.println("Введите пол в формате (male/female)");
                    String sex = sc.next();
                    System.out.println("Возраст");
                    int age = sc.nextInt();
                    System.out.println("Дата приема на работу в формате dd-MM-yyyy");
                    String employmentDate = sc.next();
                    director.addEmployee(new Employee(name, salary, new Address(country, city, street, building), sex, age, employmentDate));
                    printDirectorMenu();
                    break;
                case 3:
                    System.out.println("Введите индекс сотрудника для увольнения");
                    int index = sc.nextInt();
                    director.fireEmployee(index);
                    printDirectorMenu();
                    break;
                case 4:
                    director.showAllEmployees();
                    printDirectorMenu();
                    break;
                case 5:
                    director.payTaxes();
                    printDirectorMenu();
                    break;
                case 6:
                    System.out.println("Введите индекс сотрудника для увеличения з/п");
                    index = sc.nextInt();
                    director.salaryIncrease(index);
                    printDirectorMenu();
                    break;
                case 7:
                    director.paySalary();
                    printDirectorMenu();
                    break;
                case 8:
                    System.out.println("Финансы СЦ = $" + serviceCenter.getFinance());
                    printDirectorMenu();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        } while (!quit);
        printMainMenu();

    }
    private void menuAdmin() {
        printAdminMenu();
        boolean quit = false;
        int menuItem;
        do {
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    printAdminMenu();
                    break;
                case 2:
                    printAdminMenu();
                    break;
                case 3:
                    printAdminMenu();
                    break;
                case 4:
                    printAdminMenu();
                    break;
                case 5:
                    printAdminMenu();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        } while (!quit);
        printMainMenu();
    }
    private void menuSpecRepair() {
        printSpecRepairMenu();
        boolean quit = false;
        int menuItem;
        do {
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    printSpecRepairMenu();
                    break;
                case 2:
                    printSpecRepairMenu();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        } while (!quit);
        printMainMenu();
    }
    private void menuClient() {
        printClientMenu();
        boolean quit = false;
        int menuItem;
        do {
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    printClientMenu();
                    break;
                case 2:
                    printClientMenu();
                    break;
                case 3:
                    printClientMenu();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        } while (!quit);
        printMainMenu();
    }
}
