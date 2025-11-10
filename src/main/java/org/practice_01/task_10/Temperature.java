package org.practice_01.task_10;

public class Temperature {

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(36.6));
        System.out.println(fahrenheitToCelsius(97.8));
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    /* Создайте два метода:
    celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
    fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
    Проверьте оба метода в main. */

}
