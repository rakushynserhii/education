package org.practice_01.task_04;

public class SquareCalculator {

    public static void main(String[] args) {
        System.out.println(squareArea(10));
        System.out.println(squarePerimeter(5));
    }

    static int squareArea(int side) {
        return side * side;
    }

    static int squarePerimeter(int side) {
        return side * 4;
    }

    /* Создайте два метода:
    squareArea(int side) — возвращает площадь квадрата
    squarePerimeter(int side) — возвращает периметр
    Вызовите оба метода в main с примером. */

}
