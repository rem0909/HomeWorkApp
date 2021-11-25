package hw3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] binaryArray = new int[]{1, 1, 0, 1, 0, 0, 1, 1};
        int[] nullArray = new int[100];
        int[] thirdArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] findEqualArray = new int[]{1, 2, 3, 4, 4, 3, 3};
        int[] minAndMaxArray = getRandomArray(10);
        int[] eightArray = getRandomArray(10);
        int[][] fourthArray = getTwoDimArray(10, 0);// двумерный массив(просто чтобы не создавать его в мейне
        int[] fiveArray = getArray(5, 2);//создает массив длины len,и содержимым ячееек initialvalue

        System.out.println("Печать массива до инверсии 0 и 1");
        printArray(binaryArray);
        System.out.println("Печать массива после инверсии 0 и 1");
        invertBinaryArray(binaryArray); //нинвертирует 0 и 1
        printArray(binaryArray);//проверка первого задания
        System.out.println();

        System.out.println("Заполняем пустой массив индексами");
        fillArray(nullArray); //заполняет пустой массив значениями индекса+1
        printArray(nullArray);//печать для проверки второго задания

        System.out.println("печатаем массив для 4 -ого задания до умножения");
        printArray(thirdArray);
        multipleVariable(thirdArray); //умножает содерижмое ячейки если она < 6
        System.out.println("печатаем массив для 4 -ого задания после умножения");
        printArray(thirdArray);//проверка третьего задания
        System.out.println();

        System.out.println("Печатаем квадрат с 1 по диагоналям ");
        drawDiagonal(fourthArray);// заподняет диагоняли единицей
        printArray(fourthArray);// проверка четвертого задания

        System.out.println("Печатаем массив созданный методом с передачей len и initialValue");
        printArray(fiveArray);//проверка пятого задания

        System.out.println("Печать массива, в котором мы будем искать минимум и максимум");
        printArray(minAndMaxArray);
        findMax(minAndMaxArray);//проверка шестого задания на максимум
        findMin(minAndMaxArray);//проверка шестого задания на минимум

        System.out.println("Печатаем массив в котором будем искать место в котором сумма левой и правый части будут равны");
        printArray(findEqualArray);
        System.out.println(findEqualSumm(findEqualArray));//поиск места в котором сумма левой и правой части равны


        System.out.println("Печатаем массив до смещения: ");
        printArray(eightArray);
        System.out.println("печать массива после смещения:");
        offsetArray(eightArray, -2);
        printArray(eightArray);
    }

    public static void invertBinaryArray(int[] binaryArray) {
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = binaryArray[i] == 1 ? 0 : 1;
        }
    }

    public static void fillArray(int[] nullArray) {
        for (int i = 0; i < nullArray.length; i++) {
            nullArray[i] += i + 1;
        }
    }

    public static void multipleVariable(int[] thirdArray) {
        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] < 6) {
                thirdArray[i] *= 2;
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] getTwoDimArray(int len, int initialValue) {
        int[][] arr = new int[len][len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = initialValue;
            }

        }
        return arr;
    }

    public static void drawDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                arr[i][arr.length - 1 - i] = 1;
            }
        }
    }

    public static int[] getArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число в массиве " + max);
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве " + min);
    }

    public static int[] getRandomArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);

        }
        return arr;
    }

    public static boolean findEqualSumm(int[] arr) {
        int leftSumm = 0;
        int rightSumm;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSumm += arr[i];
            rightSumm = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSumm += arr[j];
            }
            if (leftSumm == rightSumm) {
                return true;
            }
        }
        return false;
    }

    public static void offsetArray(int[] arr, int offset) {
        int tmp;
        int tmp1;
        if (offset >= 0) {
            for (int i = 0; i < offset; i++) {
                tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    tmp1 = arr[j + 1];
                    arr[j + 1] = tmp;
                    tmp = tmp1;

                }
                arr[0] = tmp;
            }
        } else {
            offset *= -1;
            for (int i = 0; i < offset; i++) {
                tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    tmp1 = arr[j - 1];
                    arr[j - 1] = tmp;
                    tmp = tmp1;
                }
                arr[arr.length - 1] = tmp;
            }
        }
    }
}
