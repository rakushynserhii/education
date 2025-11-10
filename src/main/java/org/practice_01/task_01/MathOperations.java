package org.practice_01.task_01;

public class MathOperations {

    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(subtract(3, 5));
        System.out.println(multiply(3, 5));
        System.out.println(divide(5, 5));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(int x, int y) {
        return (double) x / y;
    }

    /* Создайте класс MathOperations с методами:
    add(int x, int y) — возвращает сумму двух чисел
    subtract(int x, int y) — разницу
    multiply(int x, int y) — произведение
    divide(int x, int y) — результат деления в double
    В main вызовите каждый метод с произвольными числами и выведите результат. */

}
