package Lesson03;

import java.util.Random;
import java.util.Scanner;



public class Lecture03 {
//    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();



    public static void main(String[] args) {

        String[][] boxesCats = new String [10][5];

        int count = 1;
        for (int i = 0; i < boxesCats.length; i++) {
            for (int j = 0; j < boxesCats[i].length; j++) {
                boxesCats[i][j] = "Cat #" + count;
                count++;
            }
        }

        for (int i = 0; i < boxesCats.length; i++) {
            for (int j = 0; j < boxesCats[i].length; j++) {
               System.out.print(boxesCats[i][j] + "\t");
            }
            System.out.println();
        }

 //       String[] boxes = new String[10];
 //       String[] cats = new String[50];

  //      fillArray(boxes, "Box");
 //       readArray(boxes);

 //       fillArray(cats, "Cat");
 //       readArray(cats);

 //       for(int i = 0; i < boxes.length; i++) {
  //          boxes[i] = "Box #" + (i +1);
  //      }

  //      for(int i = 0; i < boxes.length; i++) {
  //          System.out.print(boxes[i] + " | ");
  //      }




        int[] myIntArray = new int[4];
        myIntArray[0] = 15;
        myIntArray[1] = 20;
        myIntArray[2] = 24;
        myIntArray[3] = -35;

        System.out.println("Result " + myIntArray[2]);

        String[] myStringArray = new String[3];
        myStringArray[0] = "Hello";
        myStringArray[1] = "world";
        myStringArray[2] = "!!!";

        System.out.println(myStringArray[0] + " " + myStringArray[1] + " " + myStringArray[2]);

  //      String userInputData = scanner.next();
   //     System.out.println("Hello " + userInputData);
   //     System.out.println("Hello " + scanner.next());

  //      int a = scanner.nextInt();
   //     int result = 4 * a;
   //     System.out.println("Result " + result);

   //     scanner.close();

    //    System.out.println("Random Float " + random.nextFloat()); // [0;1]
      //  System.out.println("Random Int " + random.nextInt()); // [-int;+int]
        //System.out.println("Random Int " + random.nextInt(20)); // [0;20]


 //       for (int i = 0; i < 20; i++) {
 //           System.out.print(randomIntRange(5, 40) + " | ");
  //      }
        System.out.println("***************");
        System.out.print(randomWord(30));
    }


 //   public static int randomIntRange(int min, int max) {
 //       int diff = max - min;
  //      int value = random.nextInt(diff + 1);
 //       return value + min;
 //   }

    public static String randomWord (int value){
        String resultWord = "";
        for (int i = 0; i < value; i++) {
            int valueAscii = random.nextInt(120);
            char myChar = (char) valueAscii;
            resultWord += myChar;
        }
        return resultWord;
    }

    public static void fillArray(String[] input, String nameElement) {
        for (int i = 0; i < input.length; i++) {
            input[i] = nameElement + "#" + (i +1);
        }
    }

    public static void readArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print (input[i] + " | ");
        }
        System.out.println();
    }
}


