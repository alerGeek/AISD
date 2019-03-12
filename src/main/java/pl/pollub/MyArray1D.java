package pl.pollub;

import java.util.Random;

public class MyArray1D {

    public static int[] generateRandomArray(int length, int minRange, int maxRange) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((maxRange - minRange) + 1) + minRange;
        }
        return array;
    }
}
