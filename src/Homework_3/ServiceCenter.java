package Homework_3;


import java.io.Serializable;

public class ServiceCenter implements Serializable{
    private String scName;
    private Address scAddress = new Address();
    private int employeesCounter;
    private Employee[] listOfEmployees = new Employee[16];
    private static int goodsCounter;
    private static IGoods[] listOfGoods = new IGoods[16];
    private int finance = 2000000000;
    private Director director;

    public ServiceCenter() {
    }

    public ServiceCenter(Director director, String scName, Address scAddress) {
        this.director = director;
        this.scName = scName;
        this.scAddress = scAddress;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public Address getScAddress() {
        return scAddress;
    }

    public void setScAddress(Address scAddress) {
        this.scAddress = scAddress;
    }

    public int getEmployeesCounter() {
        return employeesCounter;
    }

    public void setEmployeesCounter(int employeesCounter) {
        this.employeesCounter = employeesCounter;
    }

    public Employee[] getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(Employee[] listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public static int getGoodsCounter() {
        return goodsCounter;
    }

    public void setGoodsCounter(int goodsCounter) {
        this.goodsCounter = goodsCounter;
    }

    public static IGoods[] getListOfGoods() {
        return listOfGoods;
    }

    public void setListOfGoods(IGoods[] listOfGoods) {
        this.listOfGoods = listOfGoods;
    }

    public int getFinance() {
        return finance;
    }

    public void setFinance(int finance) {
        this.finance = finance;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void employeeEnsureCapacity() {
        if (employeesCounter >= listOfEmployees.length) {
            Employee[] tmp = new Employee[listOfEmployees.length * 2];
            System.arraycopy(listOfEmployees, 0, tmp, 0, listOfEmployees.length);
            listOfEmployees = tmp;
        }
    }

    public boolean counterCheck() {
        boolean flag = true;
        if (employeesCounter == 0) {
            flag = false;
            System.out.println("У вас пока нет сотрудников");
        }
        return flag;
    }
}
