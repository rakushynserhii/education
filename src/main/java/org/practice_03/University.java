package org.practice_03;

public class University {

    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    void printStudentInfo() {
        System.out.println("Имя: " + this.studentName);
        System.out.println("ID: " + this.studentID);
        System.out.println("Университет: " + universityName);
    }

    public static void main(String[] args) {
        University studentFirst = new University(001, "Serhii");
        University studentSecond = new University(002, "Sasha");
        University studentThird = new University(003, "Oleg");
        University.changeUniversityName("KPI");
        studentFirst.printStudentInfo();
        studentSecond.printStudentInfo();
        studentThird.printStudentInfo();
    }

    /* Создайте класс University с полями:
    static String universityName — общее имя университета
    final int studentID — уникальный ID
    String studentName

    Реализуйте конструктор для studentID и studentName, статический метод changeUniversityName(String newName),
    геттер для studentName, метод printStudentInfo() — выводит имя, ID и университет. В main: создайте 3 студента,
    измените название университета и выведите данные. */

}
