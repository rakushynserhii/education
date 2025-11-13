package org.practice_03;

public class Company {

    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    public static void main(String[] args) {
        Company employeeFirst = new Company(001, "Serhii");
        Company employeeSecond = new Company(002, "Sasha");
        Company.companyName = "Coca-cola";
        System.out.println(Company.companyName);
    }

    /* Создайте класс Company с полями:
    static String companyName — общее название для всех сотрудников
    final int employeeID — уникальный идентификатор (нельзя менять)
    String employeeName — имя сотрудника

    Реализуйте конструктор, принимающий employeeID и employeeName, статический метод printCompanyName(),
    геттеры и сеттеры для employeeName. В main: создайте несколько сотрудников, измените companyName и проверьте,
    что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
     */

}
