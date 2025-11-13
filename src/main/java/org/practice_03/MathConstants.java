package org.practice_03;

public class MathConstants {

    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return PI * (r * r);
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        System.out.println(MathConstants.calculateCircleArea(5));
        System.out.println(MathConstants.calculateCircumference(5));
    }

    /* Создайте класс MathConstants с полями:
    final double PI = 3.14159
    final double E = 2.71828

    Реализуйте статические методы calculateCircleArea(double r) — площадь круга и
    calculateCircumference(double r) — длина окружности.
    В main: вызовите методы с разными значениями радиуса. */

}
