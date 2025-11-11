package org.practice_02;

public class Rectangle {

    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    int calculateArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        rectangle.setWidth(10);
        System.out.println(rectangle.calculateArea());
    }

    /* Создайте класс Rectangle с полями width и height. Реализуйте конструктор,
    геттеры для ширины и высоты, сеттер только для ширины и метод calculateArea()
    для расчёта площади. В main создайте прямоугольник, измените ширину и выведите площадь. */

}
