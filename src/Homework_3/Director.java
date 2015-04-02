package Homework_3;


import java.io.Serializable;

public class Director extends Employee implements Serializable {
    private static final String DIRECTOR_LOGIN = "director";
    private ServiceCenter serviceCenter;

    public Director() {
    }

    public Director(String name, int salary, Address address, String sex, int age, String employmentDate) {
        super(name, salary, address, sex, age, employmentDate);
    }


    public void setScAddress(Address address) {
        serviceCenter.setScAddress(address);
    }

    public boolean addEmployee(Employee employee) {
        boolean added = false;
        serviceCenter.employeeEnsureCapacity();
        if (serviceCenter.getEmployeesCounter() < serviceCenter.getListOfEmployees().length) {
            serviceCenter.getListOfEmployees()[serviceCenter.getEmployeesCounter()] = employee;
            serviceCenter.setEmployeesCounter(serviceCenter.getEmployeesCounter() + 1);
            System.out.println("Принят на работу новый сотрудник");
            added = true;
        }
        return added;
    }

    //спросить!
    public boolean fireEmployee(int index) {
        boolean fired = false;
        if (serviceCenter.counterCheck()) {
            if (index < serviceCenter.getEmployeesCounter() - 1) {
                System.arraycopy(serviceCenter.getListOfEmployees(), index + 1, serviceCenter.getListOfEmployees(), index, serviceCenter.getEmployeesCounter() - index - 1);

            }
            if (index == serviceCenter.getEmployeesCounter() - 1) {
                serviceCenter.getListOfEmployees()[index] = null;
            } else {
                System.out.println("Неверно указан индекс");
                return false;
            }
            serviceCenter.setEmployeesCounter(serviceCenter.getEmployeesCounter() - 1);
            System.out.println("Сотрудник уволен");
            fired = true;
        }
        return fired;
    }

    public void showAllEmployees() {
        serviceCenter.counterCheck();
        for (int i = 0; i < serviceCenter.getEmployeesCounter(); i++) {
            System.out.println("\nEmployee #" + i);
            serviceCenter.getListOfEmployees()[i].showInfo();
        }
    }

    public boolean payTaxes() {
        boolean payed = false;
        if (serviceCenter.getFinance() > 0) {
            serviceCenter.setFinance((int) (serviceCenter.getFinance() - (serviceCenter.getFinance() / 10)));
            payed = true;
        }
        return payed;
    }

    public void salaryIncrease(int index) {
        if (serviceCenter.counterCheck()) {
            serviceCenter.getListOfEmployees()[index].setSalary(getSalary() + (getSalary() / 10));
        }
    }

    public boolean paySalary() {
        boolean payed = false;
        if (serviceCenter.counterCheck()) {
            for (int i = 0; i < serviceCenter.getEmployeesCounter(); i++) {
                if (serviceCenter.getFinance() > serviceCenter.getListOfEmployees()[i].getSalary()) {
                    serviceCenter.setFinance((int) (serviceCenter.getFinance() - serviceCenter.getListOfEmployees()[i].getSalary()));
                    payed = true;
                } else {
                    System.out.println("Недостаточно средств");
                }
            }
        }
        return payed;
    }

    public void setServiceCenter(ServiceCenter serviceCenter) {
        this.serviceCenter = serviceCenter;
    }


}
