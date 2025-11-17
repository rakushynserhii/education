package org.practice_04;

import java.util.Scanner;

public class IfElsePractice {

    public static void main(String[] args) {
        sixthTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно 0");
        }
    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        int firstCount = scanner.nextInt();
        int secondCount = scanner.nextInt();

        String maxCount = (firstCount > secondCount) ? firstCount + " - Больше" : secondCount + " - Больше";
        System.out.println(maxCount);
        System.out.println("Наибольшее число - " + Math.max(firstCount, secondCount));
    }

    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        switch (count) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 1 / 2:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Такой оценки не существует");
        }
    }

    private static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count % 2 == 0)
            System.out.println("Четное");
        else
            System.out.println("Нечетное");
    }

    private static void fifthTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count < 18) {
            System.out.println("Скидка 25%");
        } else if (count >= 65) {
            System.out.println("Скидка 30%");
        } else
            System.out.println("Скидки нет");
    }

    private static void sixthTask() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count >= 90) {
            System.out.println("Отлично");
        } else if (count >= 75) {
            System.out.println("Хорошо");
        } else if (count >= 60) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

}
