package org.practice_02;

public class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void printInfo() {
        System.out.println(this.title);
        System.out.println(this.author);
    }

    public static void main(String[] args) {
        Book book = new Book("Ромашка", "Николай Близкий");
        book.setAuthor("Николай Далекий");
        book.printInfo();
    }

    /* Создайте класс Book с полями title и author. Реализуйте конструктор,
    геттеры и сеттеры, и метод printInfo(), выводящий название и автора книги.
    В main создайте книгу, измените автора и выведите информацию. */

}
