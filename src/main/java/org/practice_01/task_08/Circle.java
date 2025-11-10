package org.practice_01.task_08;

public class Circle {

    public static void main(String[] args) {
        System.out.println(circleCircumference(5));
        System.out.println(circleCircumference(10));
    }

    static double circleCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    /* Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
    Проверьте работу на нескольких значениях. */
}
