package org.practice_02;

public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void print() {
        System.out.println("Текущие кординаты x = " + this.x);
        System.out.println("Текущие кординаты y = " + this.y);
    }

    public static void main(String[] args) {
        Point point = new Point(5, 6);
        point.setX(9);
        point.print();
    }

    /* Создайте класс Point с координатами x и y. Реализуйте конструктор,
    геттеры, сеттер только для x, и метод print(), выводящий координаты.
    В main измените x, выведите новые координаты. */

}
