package Classwork.Week_1.day_1;

public class Man {
    private String name; // характеристики (поля)
    private int age;
    private String sex;

    public void setName(String name1) {
        name = name1;
    } //модификаторы состояния
    public String getName() {
        return name;
    }

    public void setAge(int age1) {
        if (age1 > 0) {
            age = age1;
        }
    }
    public int getAge() {
        return age;
    }

    public void setSex(String sex1) {
        if (sex1 == "male" | sex1 == "female") {
            sex = sex1;
        }
    }
    public String getSex() {
        return sex;
    }

    public void sayHello() { //методы
        System.out.println("Hi! My name is " + name + ", my age = " + age + ", sex is " + sex);
    }

}
