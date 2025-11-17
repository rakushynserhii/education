package org.practice_04;

import java.util.Scanner;

public class BreakContinuePractice {

    public static void main(String[] args) {
        thirdTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int firstCount = scanner.nextInt();
            int secondCount = scanner.nextInt();

            if (firstCount < 0 || secondCount < 0) {
                break;
            }

            System.out.println(firstCount + secondCount);
        }
    }

    private static void secondTask() {
        for (int i = 1; i < 21; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число:");
            int count = scanner.nextInt();
            scanner.nextLine();

            if (count < 0) {
                continue;
            }

            System.out.println(count);

            System.out.println("Введите команду для завершения:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
        }
    }

}
