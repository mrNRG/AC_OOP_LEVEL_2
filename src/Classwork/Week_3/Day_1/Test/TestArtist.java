package Classwork.Week_3.Day_1.Test;

import Classwork.Week_2.day_1.company.Developer;
import Classwork.Week_2.day_1.company.ITSpecialist;
import Classwork.Week_2.day_1.company.Tester;
import Classwork.Week_3.Day_1.Classes.Compositor;
import Classwork.Week_3.Day_1.Interfaces.ISongWriter;

public class TestArtist {

    public static void main(String[] args) {
        ITSpecialist specialist = new Developer();
        Tester tester = new Tester();


        Compositor compositor = new Compositor();
        ISongWriter compositor1 = new Compositor();

        compositor1.writeSong();
    }

}
