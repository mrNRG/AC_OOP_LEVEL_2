package Classwork.Week_3.Day_1.Classes;

import Classwork.Week_3.Day_1.Interfaces.ISinger;
import Classwork.Week_3.Day_1.Interfaces.ISongWriter;

public class Artist implements ISinger, ISongWriter {


    @Override
    public void sing() {

    }

    @Override
    public Song writeSong() {
        return null;
    }
}
