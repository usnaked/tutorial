/**
 * Created by snaked on 19.09.16.
 */

import java.util.Random;

public class Sorting {
    public static void main(String [] args) {
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());

        int[] testArray = {-2, 4, 1, 0, 8, 3, 2};
        int[] another = generateArray(10, 7, 8, rnd);
        int[] a = bubbleSort(another);
        for (int elem: a) {
            System.out.print(elem + " ");
        }
        System.out.print("");
    }

    public static int[] generateArray(int numberOfElements, int minValue, int maxValue, Random rnd) {
        // Тут должен быть код, меняющий местами min и max, в случае, если min > max
        int[] generatedArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            int generatedValue = 0;
            if (minValue < 0 && maxValue < 0) {
                generatedValue = Math.abs(maxValue) - Math.abs(minValue) - 1;
                generatedArray[i] = -(rnd.nextInt(generatedValue) + 2);
            } else {
                generatedArray[i] = rnd.nextInt(maxValue - minValue) + minValue;
            }
        }
        return generatedArray;
    }

    public static int[] bubbleSort(int[] arrayToSort) {
        //int[] result = new int[arrayToSort.length];
        for (int n = arrayToSort.length; n > 1; n--) {
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int buffer = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = buffer;
                }
            }
        }
        return arrayToSort;
    }
}
