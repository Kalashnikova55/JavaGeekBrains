package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {

    public static char[][] map;
    public static int mapWidth;
    public static int mapHeight;

    public static char human = 'X';
    public static char pc = 'O';
    public static char empty = '_';

    public static int winlength;

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {
    winlength = 3;
        mapWidth = 3;
        mapHeight = 3;
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = empty;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");

        for (int i = 0; i < mapWidth * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : (i / 2 + 1));
        }
        System.out.println();


        for (int y = 0; y < mapHeight; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[x][y] + "|");
            }
            System.out.println();
        }
    }

    public static boolean fullMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean win(char player) {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (checkLine(y, x, 1, 0, winlength, player)) {
                    return true;
                }
                if (checkLine(y, x, 1, 1, winlength, player)) {
                    return true;
                }
                if (checkLine(y, x, 0, 1, winlength, player)) {
                    return true;
                }
                if (checkLine(y, x, 1, -1, winlength, player)) {
                    return true;
                }
            }
        }
        return  false;
    }

    public static boolean checkLine(int x, int y, int vX, int vY, int len, char player) {
        final int endX = x + (len - 1) * vX;
        final int endY = y + (len - 1) * vY;
        if (!isValidCell(endX, endY)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vY][x + i * vX] != player) {
                return false;
            }
        }
        return true;
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.print("Enter your coordinates: ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;
        } while (!validCoordinates(y, x) || !emptyField(y, x));

        map[y][x] = human;
        System.out.println("Your move in [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static void pcTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapWidth);
            y = random.nextInt(mapHeight);
        } while (!emptyField(y, x));

        map[y][x] = pc;
        System.out.println("PC move in [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static boolean validCoordinates(int y, int x) {
        return x >= 0 && x < mapWidth && y < mapHeight;
    }

    public static boolean emptyField(int y, int x) {
        return map[y][x] == empty;
    }

    public static void main(String[] args) {

        createMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (win(human)) {
                System.out.println("Human win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }

            pcTurn();
            printMap();

            if (win(pc)) {
                System.out.println("PC win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }
        }

        System.out.println("Game over!");

    }
}


