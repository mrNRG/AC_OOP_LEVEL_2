package Homework_3;

public class Application {
    public static void main(String[] args) {
        Director director = new Director("Игорь Воронюк", 1000, new Address("Украина", "Киев", "Нежинская", 29), "male", 21, "01-01-2014");
        ServiceCenter serviceCenter = new ServiceCenter(director,"Samsung",new Address("Украина", "Киев", "Крещатик", 1));
        serviceCenter.setDirector(director);
        director.setServiceCenter(serviceCenter);
        Menu menu = new Menu(serviceCenter, director);
        menu.startMenu();
    }
}