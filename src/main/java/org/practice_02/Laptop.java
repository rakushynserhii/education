package org.practice_02;

public class Laptop {

    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void printInfo() {
        System.out.println(this.brand);
        System.out.println(this.price);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Asus", 20000);
        laptop.setPrice(21000);
        laptop.printInfo();
    }

    /* Создайте класс Laptop с полями brand и price. Реализуйте конструктор,
    геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене.
    В main измените цену и выведите информацию. */

}
