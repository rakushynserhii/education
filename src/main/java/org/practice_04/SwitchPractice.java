package org.practice_04;

import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {
        fifthTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Not found");
        }
    }

    private static void secondTask() {
        System.out.println("Введите число от 1 до 7(в зависимости от дня недели)");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count > 0 && count < 6) {
            System.out.println("Будние дни (1–5) — 300 рублей");
        } else if (count < 8) {
            System.out.println("Выходные (6–7) — 450 рублей");
        } else
            System.out.println("Некорректное число");
    }

    private static void thirdTask() {
        System.out.println("Введите число от 0 до 100");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count > 89 && count < 101) {
            System.out.println("A");
        } else if (count > 79 && count < 90) {
            System.out.println("B");
        } else if (count > 69 && count < 80) {
            System.out.println("C");
        } else if (count > 59 && count < 70) {
            System.out.println("D");
        } else if (count >= 0 && count < 60) {
            System.out.println("F");
        } else
            System.out.println("Некорректное число");
    }

    private static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Статус системы");
                break;
            default:
                System.out.println("Такой команды не существует");
        }
    }

    private static void fifthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число");
        double firstCount = scanner.nextInt();
        System.out.println("Число");
        double secondCount = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Строка");
        String ch = scanner.nextLine();

        switch (ch) {
            case "+":
                System.out.println(firstCount + secondCount);
                break;
            case "-":
                System.out.println(firstCount - secondCount);
                break;
            case "*":
                System.out.println(firstCount * secondCount);
                break;
            case "/":
                if (secondCount == 0 || firstCount == 0) {
                    System.out.println("Нельзя делить на 0");
                    break;
                }
                System.out.println(firstCount / secondCount);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }

}
