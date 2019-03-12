package pl.pollub;

import java.util.Random;

public class MyArray2D {

    public static int[][] generateRandom(int row, int column, int minRange, int maxRange) {
        Random random = new Random();

        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt((maxRange - minRange) + 1) + minRange;
            }
        }
        return array;
    }

    public static void bubbleSort(int array[][], int row, int column, boolean sortAsc, int nrColumnToSort) {
        int n = column + 1;
        if (!sortAsc) {
            bubbleSortDesc(array, row, column, nrColumnToSort, n);
        } else {
            bubbleSortAsc(array, row, column, nrColumnToSort, n);
        }
    }

    public static void print(int[][] array, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void bubbleSortAsc(int[][] array, int row, int column, int nrColumnToSort, int n) {
        while (n > 1) {
            for (int i = 0; i < row - 1; i++) {
                for (int j = 0; j < column; j++) {
                    if (array[i][nrColumnToSort] > array[i + 1][nrColumnToSort]) {
                        for (int k = 0; k <= nrColumnToSort; k++) {
                            swap(array, i, j);
                        }
                        for (int k = nrColumnToSort + 1; k < column; k++) {
                            swap(array, i, k);
                        }
                    }
                }
            }
            n--;
        }
    }

    private static void bubbleSortDesc(int[][] array, int row, int column, int nrColumnToSort, int n) {
        while (n > 1) {
            for (int i = 0; i < row - 1; i++) {
                for (int j = 0; j < column; j++) {
                    if (array[i][nrColumnToSort] < array[i + 1][nrColumnToSort]) {
                        swap(array, i, j);
                        for (int k = nrColumnToSort + 1; k < column; k++) {
                            swap(array, i, k);
                        }
                    }
                }
            }
            n--;
        }
    }

    private static void swap(int[][] array, int r, int c) {
        int temp = array[r][c];
        array[r][c] = array[r + 1][c];
        array[r + 1][c] = temp;
    }
}

