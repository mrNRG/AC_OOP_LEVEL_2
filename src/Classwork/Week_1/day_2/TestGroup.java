package Classwork.Week_1.day_2;

public class TestGroup {

    public static void main(String[] args) {
        Group group = new Group("AA11", 20);

        System.out.println(group.getGroupName());
        Student[] g1 = group.getStudents();
        System.out.println(g1.length);

        Student student = new Student("Anton", "AA11");
//before add method
        Student[] temp = group.getStudents();
//    temp[0] = student;

//    group.getStudents()[0].showInfo();
//after addStudent method

        group.addStudent(student);
        group.showStudents();

    }

}