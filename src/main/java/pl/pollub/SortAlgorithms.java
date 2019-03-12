package pl.pollub;

public class SortAlgorithms {

    public static void selectSort(int[] array, boolean isAscending) {
        if (isAscending) {
            selectSortAsc(array);
        } else {
            selectSortDesc(array);
        }
    }

    private static void selectSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(array, i, minIndex);
            }
        }
    }

    private static void selectSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(array, i, minIndex);
            }
        }
    }

    public static void bubbleSort(int[] array, boolean isAscending) {
        if (isAscending) {
            bubbleSortAsc(array);
        } else {
            bubbleSortDesc(array);
        }
    }

    private static void bubbleSortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void bubbleSortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void insertSort(int[] array, boolean isAscending) {
        if (isAscending) {
            insertSortAsc(array);
        } else {
            insertSortDesc(array);
        }
    }

    private static void insertSortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int minSortingValue = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > minSortingValue) {
                swap(array, j, j + 1);
                j = j - 1;
            }
            array[j + 1] = minSortingValue;
        }
    }

    private static void insertSortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int minSortingValue = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] < minSortingValue) {
                swap(array, j, j + 1);
                j = j - 1;
            }
            array[j + 1] = minSortingValue;
        }
    }

    
    private static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }
}
