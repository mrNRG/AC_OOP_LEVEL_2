package Homework_1;

public class Company {

    private String companyName;
    private Address companyAddress = new Address();
    private int numberOfEmployees;
    private Employee[] listOfEmployees;

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName, Address companyAddress, int listSize, Employee[] listOfEmployees) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.listOfEmployees = new Employee[listSize];

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setListOfEmployees(Employee[] listOfEmployees) {

    }

    public Employee[] getListOfEmployees() {
        return listOfEmployees;
    }

    public boolean addEmployee(Employee employee) {
        boolean added = false;
        if (numberOfEmployees < listOfEmployees.length) {
            listOfEmployees[numberOfEmployees] = employee;
            numberOfEmployees++;
            added = true;
        }
        System.out.println("New employee added");
        return added;
    }

    public boolean fireEmployee(Employee[] employees, int index) {
        boolean fired = false;
        for (int i = 0; i < numberOfEmployees; i++) {
            if (i < index) {
                listOfEmployees[i] = listOfEmployees[i];
            }
            if (i > index) {
                listOfEmployees[i - 1] = listOfEmployees[i];
            }
        }
        numberOfEmployees--;
        fired = true;
        System.out.println("An employee is fired");
        return fired;
    }

    public void fireBadEmployee(Employee[] employees) {
        for (int i = 0; i < numberOfEmployees; i++) {
            if (listOfEmployees[i].getSalary() < 1000 && listOfEmployees[i].getWorkingExperience() < 12) {
                fireEmployee(listOfEmployees, i);
            }
        }
    }

    public void showInfo() {
        System.out.println("Company name is " + companyName);
        companyAddress.showAll();
    }

    public void showAllEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEmployee #" + i);
            listOfEmployees[i].showInfo();
        }
    }

    public void showSomeEmployees() {

        for (int i = 0; i < numberOfEmployees; i++) {
            if (listOfEmployees[i].getWorkingExperience() > 12) {
                System.out.println("\nEmployee #" + i);
                listOfEmployees[i].showInfo();
            }
        }

    }

    public void showOtherEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            if (listOfEmployees[i].getSex().equals("female") && listOfEmployees[i].getAddress().getCity().equals("Kiev")) {
                System.out.println("\nEmployee #" + i);
                listOfEmployees[i].showInfo();
            }
        }
    }

    public void showSortedEmployes() {
        System.out.println("\nWomen: ");
        for (int i = 0; i < numberOfEmployees; i++) {
            if (listOfEmployees[i].getSex().equals("female")) {
                System.out.println("\nEmployee #" + i);
                listOfEmployees[i].showInfo();
            }
        }
        System.out.println("\nMen: ");
        for (int i = 0; i < numberOfEmployees; i++) {
            if (listOfEmployees[i].getSex().equals("male")) {
                System.out.println("\nEmployee #" + i);
                listOfEmployees[i].showInfo();
            }
        }
    }
}
