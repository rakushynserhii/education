package org.practice_01.task_07;

public class Hypotenuse {

    public static void main(String[] args) {
        System.out.println(findHypotenuse(3, 6.5));
        System.out.println(findHypotenuse(2.5, 0.5));
    }

    static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /* Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора: √(a² + b²)
    Вызовите метод с несколькими наборами чисел. */

}
