package pl.pollub;

public class SortAlgorithms {

    public static void selectSort(int[] tab, boolean isAscending) {
        if (isAscending) {
            selectSortAsc(tab);
        } else {
            selectSortDesc(tab);
        }
    }

    private static void selectSortAsc(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(tab, i, minIndex);
            }
        }
    }

    private static void selectSortDesc(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(tab, i, minIndex);
            }
        }
    }

    public static void bubbleSort(int[] tab, boolean isAscending) {
        if (isAscending) {
            bubbleSortAsc(tab);
        } else {
            bubbleSortDesc(tab);
        }
    }

    private static void bubbleSortAsc(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    swap(tab, j, j + 1);
                }
            }
        }
    }

    private static void bubbleSortDesc(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] < tab[j + 1]) {
                    swap(tab, j, j + 1);
                }
            }
        }
    }

    public static void injectionSort(int[] tab, boolean isAscending) {
        if (isAscending) {
            injectionSortAsc(tab);
        } else {
            injectionSortDesc(tab);
        }
    }

    private static void injectionSortAsc(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int minSortingValue = tab[i];

            int j = i - 1;
            while (j >= 0 && tab[j] > minSortingValue) {
                swap(tab, j, j + 1);
                j = j - 1;
            }
            tab[j + 1] = minSortingValue;
        }
    }

    private static void injectionSortDesc(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int minSortingValue = tab[i];

            int j = i - 1;
            while (j >= 0 && tab[j] < minSortingValue) {
                swap(tab, j, j + 1);
                j = j - 1;
            }
            tab[j + 1] = minSortingValue;
        }
    }

    private static void swap(int[] tab, int a, int b) {
        int pom = tab[b];
        tab[b] = tab[a];
        tab[a] = pom;
    }
}
