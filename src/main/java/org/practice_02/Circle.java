package org.practice_02;

public class Circle {

    private static final double PI = 3.14;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return PI * (this.radius * this.radius);
    }

    double calculateCircumference() {
        return 2 * PI * this.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setRadius(6);
        System.out.println(circle.calculateArea());;
        System.out.println(circle.calculateCircumference());;
    }

    /* Создайте класс Circle с полем radius. Реализуйте конструктор,
    геттер и сеттер, методы calculateArea() и calculateCircumference().
    В main измените радиус, выведите площадь(pir2) и длину окружности(2pir). */

}
