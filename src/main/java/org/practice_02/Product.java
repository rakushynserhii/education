package org.practice_02;

public class Product {

    String name = null;
    double price = 0;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        this.price = this.price - (this.price / 100 * discount);
    }

    void printInfo() {
        System.out.println(this.name);
        System.out.println(this.price);
    }

    public static void main(String[] args) {
        Product product = new Product("Помидор", 10);
        product.setPrice(100.0);
        product.applyDiscount(30);
        System.out.println(product.getPrice());;
    }

    /* Создайте класс Product с полями name и price. Реализуйте конструктор,
    геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки,
    и метод printInfo(), выводящий информацию о товаре и цене. В main измените цену,
    примените скидку и выведите цену. */

}
