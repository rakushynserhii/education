package org.practice_04;

import java.util.Scanner;

public class DoWhilePractice {

    public static void main(String[] args) {
        fifthTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int count;

        do {
            count = scanner.nextInt();
        } while (count <= 0);

        System.out.println(count);
    }

    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        String pass = "12345678";
        String password;

        do {
            password = scanner.nextLine();
        } while (!password.equals(pass));
    }

    private static void thirdTask() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    private static void fourthTask() {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Введите команду для завершения работы");
             command = scanner.nextLine();
        } while (!command.equals("exit"));
    }

    private static void fifthTask() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;

        do {
            number = number / 10;
            count++;
        } while (number > 10);

        System.out.println(count);
    }

}
