package pl.pollub;

public class SearchAlgorithms {
    protected static int value = -1;
    protected static int index = -1;

    public static void linear(int[] array, int searchValue) {
        value = searchValue;
        for (int i = 0; i < array.length; i++) {
            if (searchValue == array[i]) {
                index = i;
                break;
            }
        }
    }

    public static void bisection(int[] array, int searchValue) {
        value = searchValue;
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (searchValue == array[middleIndex]) {
                index = middleIndex;
                break;
            } else if (searchValue > array[middleIndex]) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
    }

}
