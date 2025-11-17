package org.practice_04;

import java.util.Scanner;

public class WhilePractice {

    public static void main(String[] args) {
        thirdTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= count) {
            result = result * i;
            i++;
        }

        System.out.println(result);
    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int i = 1;

        while (i <= count) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (1 <= count) {
            System.out.println(count);
            count--;
        }
    }

}
