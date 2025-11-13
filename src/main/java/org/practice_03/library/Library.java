package org.practice_03.library;

public class Library {

    private String bookTitle = "1";
    protected String author = "1";
    int year = 2000;
    public String category = "1";

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /* Создайте класс Library с полями:
    private String bookTitle
    protected String author
    int year (default-доступ)
    public String category

    Реализуйте геттеры и сеттеры для всех полей. В другом классе (например, LibraryTest)
    создайте объект Library и проверьте доступ к полям. */

}
