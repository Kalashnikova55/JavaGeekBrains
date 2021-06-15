package Lesson03;
import java.util.Random;

public class HomeWork03 {

 //   public static void shifter(int[] ary, int value) {
 //       boolean direction;
 //       if (value < 0) {
 //           direction = true;
 //           value = -value;
 //       } else {
 //           direction = false;
 //       }

 //       value %= ary.length;
 //       int lastIndex = ary.length - 1;
 //       for (int i = 0; i < value; i++) {
 //           int temp = (direction) ? ary[0] : ary[lastIndex];
 //           for (int j = 0; j < lastIndex; j++) {
 //               if (direction)
 //                   ary[j] = ary[j + 1];
 //               else
 //                   ary[lastIndex - j] = ary[lastIndex - j - 1];
 //           }
 //           if (direction)
 //               ary[lastIndex] = temp;
 //           else
 //               ary[0] = temp;
 //       }


    private static boolean checkBalance (int[] array) {
            int right = 0, left = 0;
            for (int i = 0; i < array.length - 1; i++) {
                left += array[i];
                for (int j = i + 1; j < array.length; j++)
                    right += array[j];
                if (left == right) return true;
                right = 0;
            }
            return false;
        }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    public static void printArray1(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return (tempArray);
    }

    public static void Main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(2);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
            System.out.print(numbers[i] + " ");
        }



        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " ");
        }


        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 6) {
                System.out.print(massive [i] * 2 + " ");
            } else {
                System.out.print(massive [i] + " ");
            }
        }



        int side = 9;
        int [][] square = new int [side][side];
        crossFill(square);

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }



        int[] returnArrayFromMethod = returnArray(10, 999);
        printArray1(returnArrayFromMethod);



        int[] compare = new int[10];
        for (int i = 0; i < compare.length; i++) {
            compare[i] = random.nextInt(10);
            System.out.print(compare[i] + " ");
        }
        System.out.println();

        System.out.print("Min:" + " " + findMin(compare));
        System.out.println();
        System.out.print("Max:" + " " + findMax(compare));


        int[] balance = {1, 1, 1, 1, 1, 1, 6};
        System.out.println(checkBalance(balance));


 //       int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
 //       printArray1(shiftArray);
 //       shifter(shiftArray, -3);
 //       printArray1(shiftArray);
 //       shifter(shiftArray, 6);
 //       printArray1(shiftArray);

    }
    public static Random random = new Random();
}
