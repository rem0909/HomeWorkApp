package hw4;

import java.util.Random;
import java.util.Scanner;

public class XOGame {

    static final char DOT_X = 'X';
    static final char DOT_0 = '0';
    static final char DOT_EMPTY = '.';
    static int mapSize;
    static int winLineSize;
    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер поля и длинну победной линии ");
        mapSize = sc.nextInt();
        winLineSize = sc.nextInt();
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Поздравляем, победил игрок");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("победил АИ");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= mapSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < mapSize; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < mapSize; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Input x,y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }
    //ai
    public static void aiTurn() {
        int x, y;
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if(isCellValid(i,j)){
                    map[i][j] = DOT_0;
                    if (checkWin(DOT_0)){
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (isCellValid(i,j)){
                    map[i][j] = DOT_X;
                    if(checkWin(DOT_X)){
                        map[i][j] = DOT_0;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }

            }
        }

        do {
            y = random.nextInt(mapSize);
            x = random.nextInt(mapSize);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_0;
    }

    // проверка на валидность ячейки и полноту поля
    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= mapSize || x >= mapSize) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // часть с проверкой линий на победу
    public static boolean checkWin(char c) {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (checkLines(i, j, c, 0, 1) ||
                        checkLines(i, j, c, 1, 0) ||
                        checkLines(i, j, c, 1, 1) ||
                        checkLines(i, j, c, -1, 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkLines(int y, int x, char c, int coefY, int coefX) {
        if (x + coefX * (winLineSize - 1) > mapSize - 1 ||
                y + coefY * (winLineSize - 1) > mapSize - 1 ||
                y + coefY * (winLineSize - 1) < 0) {
            return false;
        }

        for (int i = 0; i < winLineSize; i++) {
            if (map[y + i * coefY][x + i * coefX] != c) {
                return false;
            }
        }
        return true;
    }

}



