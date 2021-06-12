package Lesson02;

public class Homework2 {
    public static void main(String[] args) {
        add(10, 5);
        System.out.println (add2(15,27));
        positive(-64);

        String result = (positive2(16)) ? "Число положительное" : "Число отрицательное";
        System.out.println (result);

        linePrint("Hello",6);
        
        System.out.println(leapYear(1997));
    }

   public static void add(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean add2(int a, int b) {
        return (a + b >=10 && a + b <= 20);
    }

    public static void positive(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positive2 (int a) {
        return a >= 0;
    }

    public static void linePrint (String value, int count) {
        for (int i = 1; i < count; i++) {
            System.out.println(i + " " + value);
        }
    }

    public static boolean leapYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}


