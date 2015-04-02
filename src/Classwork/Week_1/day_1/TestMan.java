package Classwork.Week_1.day_1;

public class TestMan {
    public static void main(String[] args) {
        Man man = new Man();
        man.setName("Artem");
//    man.name = "Artem";
        man.setAge(22);
        man.setSex("male");

        System.out.println("Age = " + man.getAge());

//    System.out.println("Age = " + man.age +
//                         ", name = " + man.name);
        man.sayHello();

        Man m1 = new Man();
//    m1.name = "Katia";
//    m1.age = -10;
//    m1.sex = "dog";



        m1.sayHello();
    }
}
