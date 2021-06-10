package Lesson02;

public class Lecture02 {


    public static void main(String[] args) {
        int a = 15;
        int b = 34;
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        System.out.println("Result " + result);

        result = (a > b) ? a : b;
        System.out.println("Result " + result);

        System.out.println("***********");

        String nameLetter = "Marina";

        if (nameLetter == "Boris") {
            System.out.println("Give letter to Boris");
        } else if (nameLetter == "Irina") {
            System.out.println("Give letter to Irina");
        } else if (nameLetter == "Marina") {
            System.out.println("Give letter to Marina");
        } else if (nameLetter == "Alex") {
            System.out.println("Give letter to Alex");
        } else {
            System.out.println("Leave the office");
        }
        System.out.println("***********");

        switch (nameLetter) {
            case "Boris":
                System.out.println("Give letter to Boris");
                break;
            case "Irina":
                System.out.println("Give letter to Irina");
                break;
            case "Marina":
                System.out.println("Give letter to Marina");
                break;
            case "Alex":
                System.out.println("Give letter to Alex");
                break;
            default:
                System.out.println("Leave the office");
        }
        System.out.println("***********");

        System.out.println (myMath(2, 10));
        System.out.println("***********");

        table(10, 10 );
        System.out.println("***********");

        int l = 0;

        while (l < 10) {
            l++;
            if (l == 6 || l == 9) {
                continue;
            }
            System.out. print (l + " ");
        }

        System.out. println ("************");


        int z = 0;

        do {
            z++;
            if (z == 7) {
                break;
            }
            System.out.print(z + " ");
        } while (z < 10);
    }


    public static int myMath(int baseValue, int signatureValue) {
        int result = 1;
        for (int i = 1; i <= signatureValue; i++) {
            result = result * baseValue;
        }
        return result;
    }



    public static void table(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }
}

