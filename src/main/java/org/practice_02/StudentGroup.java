package org.practice_02;

public class StudentGroup {

    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("Группа: " + this.groupName);
        System.out.println("Кол-во студентов: " + this.studentCount);
    }

    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup("A2", 22);
        studentGroup.setStudentCount(23);
        studentGroup.printInfo();
    }

    /* Создайте класс StudentGroup с полями groupName и studentCount.
    Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
    выводящий информацию о группе и количестве студентов.
    В main измените число студентов и выведите информацию. */

}
