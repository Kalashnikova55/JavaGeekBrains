package Lesson01;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }

    public static void printThreeWords () {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void checkSumSign() {
        int a = 6;
        int b = 17;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor () {
        int value = 26;
        if (value <= 0) {
            System.out.println ("Красный");
        } else if (0 < value & value <= 100) {
            System.out.println ("Жёлтый");
        } else if (value > 100) {
            System.out.println ("Зелёный");
        }
    }

    public static void compareNumbers () {
        int a = 50;
        int b = 14;
        if (a >= b) {
            System.out.println ("a >= b");
        } else if (a < b) {
            System.out.println ("a < b");
        }
    }
}
