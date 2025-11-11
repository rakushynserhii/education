package org.practice_02;

public class BankAccount {

    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public void printBalance() {
        System.out.println("Текущий баланс: " +  this.balance + " рублей");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Сергей", 100);
        bankAccount.deposit(20);
        bankAccount.withdraw(50);
        bankAccount.printBalance();
    }

    /* Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор,
    геттеры, сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод
    printBalance(). В main внесите деньги, снимите и выведите баланс. */

}
