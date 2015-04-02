package Classwork.Week_2.day_1;

import Classwork.Week_2.day_1.company.Developer;
import Classwork.Week_2.day_1.company.HR;
import Classwork.Week_2.day_1.company.ITSpecialist;
import Classwork.Week_2.day_1.company.Tester;

public class TestExtension {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setNumberOfLanguages(2);
        developer.salary = 2;

        Tester tester = new Tester();

        tester.name = "Vasia";

        HR hr = new HR();

        hr.work();

        ITSpecialist specialist = new Developer();
        specialist.work();

        developer.work();
        developer.work();

    }

}
