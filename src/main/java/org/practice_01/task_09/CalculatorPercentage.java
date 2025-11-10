package org.practice_01.task_09;

public class CalculatorPercentage {

    public static void main(String[] args) {
        System.out.println(calculatePercentage(4700, 500) + "%");
        System.out.println(calculatePercentage(6000, 100) + "%");
    }

    static double calculatePercentage(double total, double part) {
        return 100 / (total / part);
    }

    /* Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент
    от общего составляет часть. Пример: 25 из 200 → 12.5% */

}
