package hw2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSumm(2, 7));
        checkPositiveNumber(0);
        System.out.println(returnTrueIfNegative(-10));
        printString("Hello", 10);
        System.out.println(checkIfLeapYear(800));
    }

    public static boolean checkSumm(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void checkPositiveNumber(int a) {
        if (a < 0) {
            System.out.printf("Число %d отрицательное\n", a);
        } else {
            System.out.printf("Число %d положительное\n", a);
        }
    }

    public static boolean returnTrueIfNegative(int a) {
        return (a <= 0);
    }

    public static void printString(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    public static boolean checkIfLeapYear(int y) {
        return ((y % 400 == 0) || (y % 100 != 0 && y % 4 == 0));
        /* Каждый 400 год 100% високосный,
        остальные года, при условии , если они не делятся на 100 без остатка
        и делятся без остатка на 4 - високосные.
         */
    }

}
