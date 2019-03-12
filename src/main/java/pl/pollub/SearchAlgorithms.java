package pl.pollub;


import lombok.Getter;

@Getter
public class SearchAlgorithms {
    protected static int value = -1;
    protected static int index = -1;

    public static void linear(int[] tab, int searchValue) {
        value = searchValue;
        for (int i = 0; i < tab.length; i++) {
            if (searchValue == tab[i]) {
                index = i;
                break;
            }
        }
    }

    public static void bisection(int[] tab, int searchValue) {
        value = searchValue;
        int startIndex = 0;
        int endIndex = tab.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (searchValue == tab[middleIndex]) {
                index = middleIndex;
                break;
            } else if (searchValue > tab[middleIndex]) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
    }

}
