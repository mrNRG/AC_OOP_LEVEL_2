package Classwork.Week_6.Day_1;

import java.io.*;
import java.util.Scanner;

public class TestReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\WAR_MACHINE\\IdeaProjects\\Taffest");

        while (!file.exists()) {
            System.out.println("Enter right path");
            file = new File(sc.nextLine());
        }

        System.out.println("Enter text");
        String line = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!line.isEmpty()) {
            stringBuilder.append(line);
            line = sc.nextLine();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

        try {
            bufferedWriter.write(String.valueOf(stringBuilder));
        }
        finally {
            bufferedWriter.close();
        }


    }
}
