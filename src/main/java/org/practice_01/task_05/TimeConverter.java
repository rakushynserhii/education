package org.practice_01.task_05;

public class TimeConverter {

    public static void main(String[] args) {
        System.out.println(convertSecondsToMinutes(180));
    }

    static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    /* Создайте метод convertSecondsToMinutes(int seconds),
    который возвращает количество минут (целых или дробных).
    Вызовите метод в main и выведите результат. */

}
