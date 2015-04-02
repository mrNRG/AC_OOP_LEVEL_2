package Homework_3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private int salary;
    private Address address = new Address();
    private String sex;
    private int age;
    private Date employmentDate = new Date();
//    private int workingExperience;

    public Employee() {
    }

    public Employee(String name, int salary, Address address, String sex, int age, String employmentDate) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        setSex(sex);
        this.age = age;
        setEmploymentDate(employmentDate);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male") | sex.equals("female")) {
            this.sex = sex;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmploymentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(employmentDate);
    }

    public void setEmploymentDate(String employmentDate) {
        try {
            this.employmentDate = new SimpleDateFormat("dd-MM-yyyy").parse(employmentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getWorkingExperience() {
        Calendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(employmentDate);
        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(new Date());

        int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
        return diffMonth;
    }

    public void showInfo() {
        System.out.println("Employee's name is " + name
                + ", salary = " + salary
                + ", sex: " + sex
                + ", age = " + age
                + ", working experience = " + getWorkingExperience() + " months");
        address.showAll();
    }
}
