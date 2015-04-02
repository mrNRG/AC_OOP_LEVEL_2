package Homework_1;

public class TestEmployee {

    public static void main(String[] args) {
        int arraySize = 10;
        Employee[] employees = new Employee[arraySize];
        Company bigCompany = new Company("ART-CODE", new Address("Ukraine", "Kiev", "Starokievskaia", 10), arraySize, employees);

        Employee employee1 = new Employee("Igor", 1500, new Address("Ukraine", "Kiev", "Nezhynskaia", 29), "male", 21, "01-01-2013");
        Employee employee2 = new Employee("Artem", 2500, new Address("Ukraine", "Kiev", "Nezhynskaia", 29), "male", 21, "01-12-2010");
        Employee employee3 = new Employee("Viktoria", 900, new Address("Ukraine", "Kiev", "Nezhynskaia", 29), "female", 20, "01-01-2015");
        Employee employee4 = new Employee("Yaroslav", 1000, new Address("Ukraine", "Kiev", "Nezhynskaia", 29), "male", 21, "01-03-2014");

//        bigCompany.showInfo();
//        bigCompany.addEmployee(employee1);
//        bigCompany.addEmployee(employee2);
//        bigCompany.addEmployee(employee3);
//        bigCompany.addEmployee(employee4);
//        bigCompany.showAllEmployees();
//        System.out.println();
//        bigCompany.getEmployeesCounter();

        System.out.println(employee1.getWorkingExperience());
    }
}
