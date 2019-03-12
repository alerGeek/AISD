package pl.pollub;

import java.util.Random;

public class MyArray2D {

    public static int[][] generateRandom(int r, int c, int minRange, int maxRange) {
        Random random = new Random();

        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = random.nextInt((maxRange - minRange) + 1) + minRange;
            }
        }
        return array;
    }

    public static void bubbleSort(int tab[][], int row, int column, boolean sortAsc, int nrColumnToSort) {
        int n = column + 1;
        if (!sortAsc) {
            bubbleSortDesc(tab, row, column, nrColumnToSort, n);
        } else {
            bubbleSortAsc(tab, row, column, nrColumnToSort, n);
        }
    }

    public static void print(int[][] tab, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void bubbleSortAsc(int[][] tab, int row, int column, int nrColumnToSort, int n) {
        while (n > 1) {
            for (int i = 0; i < row - 1; i++) {
                for (int j = 0; j < column; j++) {
                    if (tab[i][nrColumnToSort] > tab[i + 1][nrColumnToSort]) {
                        for (int k = 0; k <= nrColumnToSort; k++) {
                            swap(tab, i, j);
                        }
                        for (int k = nrColumnToSort + 1; k < column; k++) {
                            swap(tab, i, k);
                        }
                    }
                }
            }
            n--;
        }
    }

    private static void bubbleSortDesc(int[][] tab, int row, int column, int nrColumnToSort, int n) {
        while (n > 1) {
            for (int i = 0; i < row - 1; i++) {
                for (int j = 0; j < column; j++) {
                    if (tab[i][nrColumnToSort] < tab[i + 1][nrColumnToSort]) {
                        swap(tab, i, j);
                        for (int k = nrColumnToSort + 1; k < column; k++) {
                            swap(tab, i, k);
                        }
                    }
                }
            }
            n--;
        }
    }

    private static void swap(int[][] tab, int r, int c) {
        int pom = tab[r][c];
        tab[r][c] = tab[r + 1][c];
        tab[r + 1][c] = pom;
    }
}

