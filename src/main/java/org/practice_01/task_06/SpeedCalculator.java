package org.practice_01.task_06;

public class SpeedCalculator {

    public static void main(String[] args) {
        System.out.println(averageSpeed(1000, 60));
        System.out.println(averageSpeed(5000, 180));
    }

    static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    /* Создайте метод averageSpeed(double distance, double time),
    который возвращает среднюю скорость (distance / time).
    Вызовите метод с разными значениями. */

}
