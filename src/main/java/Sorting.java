/**
 * Created by snaked on 19.09.16.
 */

import java.util.Random;

public class Sorting {
    public static void main(String [] args) {
        int[] testArray = {-2, 4, 1, 0, 8, 3, 2};
        int[] another = generateArray(10, -5, 10);
        int[] a = bubbleSort(another, true);
        for (int elem: a) {
            System.out.print(elem + " ");
        }
        System.out.print("");
    }

    public static int[] generateArray(int numberOfElements, int minValue, int maxValue) {
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());
        int[] generatedArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            generatedArray[i] = rnd.nextInt(maxValue) + minValue;
        }
        return generatedArray;
    }

    public static int[] bubbleSort(int[] arrayToSort, boolean increase) {
        int buffer;
        int n;
        int[] result = new int[arrayToSort.length];
        for (n = arrayToSort.length; n > 1; n--) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    buffer = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = buffer;
                }
            }
        }
        return arrayToSort;
    }
}
