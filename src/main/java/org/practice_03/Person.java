package org.practice_03;

public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }

    public static void main(String[] args) {
        Person personFirst = new Person("Serhii", "Rakushyn", "123-45-6789");
        Person personSecond = new Person("Sasha", "Ivanov", "777-77-7777");
        Person personThird = new Person("Oleg", "Petrov", "333-33-3333");
        personFirst.setFirstName("Kolya");
        personFirst.printPersonInfo();
        personSecond.printPersonInfo();
        personThird.printPersonInfo();
    }

    /* Создайте класс Person с полями:
    private String firstName
    private String lastName
    private final String ssn — номер социального страхования

    Реализуйте конструктор для всех трёх полей, геттеры для всех полей, сеттеры только для firstName и lastName,
    метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
    В main: создайте несколько объектов, измените имя у одного и выведите информацию. */

}
