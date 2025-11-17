package org.practice_04;

import java.util.Scanner;

public class ForPractice {

    public static void main(String[] args) {
        fifthTask();
    }

    private static void firstTask() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }

    private static void secondTask() {
        System.out.println("Введите число больше 0");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Сумма чисел " + n + " = " + sum);
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            int pr = i * count;
            System.out.println(count + " * " + i + " = " + pr);
        }
    }

    private static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        boolean isPrime = true;

        if (count < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < count; i++) {
                if (count % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("Простое");
        else
            System.out.println("Не простое");
    }

    private static void fifthTask() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }

}
