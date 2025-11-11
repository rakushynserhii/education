package org.practice_02;

public class Teacher {

    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }

    String getSubject() {
        return this.subject;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println("Teacher name - " + this.name);
        System.out.println("Subject - " + this.subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Olga", "Biology");
        teacher.setSubject("Geography");
        teacher.printInfo();
    }

    /* Создайте класс Teacher с полями name и subject. Реализуйте конструктор,
    геттеры и сеттеры, и метод printInfo(), выводящий информацию о учителе и предмете.
    В main измените предмет и выведите обновлённую информацию. */

}
