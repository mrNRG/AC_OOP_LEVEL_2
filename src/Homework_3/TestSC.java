package Homework_3;

import java.io.*;

public class TestSC {
    public static void main(String[] args) {
        Director director = new Director("Игорь Воронюк", 1000, new Address("Украина", "Киев", "Нежинская", 29), "male", 21, "01-01-2014");
        ServiceCenter serviceCenter = new ServiceCenter(director, "Samsung", new Address("Украина", "Киев", "Крещатик", 1));
        serviceCenter.setDirector(director);
        director.setServiceCenter(serviceCenter);

        ServiceCenter serviceCenterReaded = null;
        File file = new File("C:\\Users\\WAR_MACHINE\\IdeaProjects\\BD");
        file.setReadable(true);
        try {
            boolean result = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //
        ObjectOutputStream oos = null;
        try {
            OutputStream outputStream = new FileOutputStream(file);
            oos = new ObjectOutputStream(outputStream);
            oos.writeObject(serviceCenter);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //
        ObjectInputStream ois = null;
        try {
            InputStream inputStream = new FileInputStream(file);
            ois = new ObjectInputStream(inputStream);
            serviceCenterReaded = (ServiceCenter) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        serviceCenterReaded.getScAddress().showAll();


    }
}
