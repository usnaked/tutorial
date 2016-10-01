/**
 * Created by snaked on 19.09.16.
 */

import java.util.Random;

public class Sorting {
    public static void main(String [] args) {
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());

        int[] testArray = {-2, 4, 1, 0, 8, 3, 2};
        int[] another = generateArray(10, -3, 3, rnd);
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
                generatedValue = Math.abs(minValue) - Math.abs(maxValue);
                generatedArray[i] = -(rnd.nextInt(generatedValue) + 2);
            } else {
                generatedArray[i] = rnd.nextInt(maxValue - minValue) + minValue;
            }
        }
        return generatedArray;
    }

    public static int[] bubbleSort(int[] arrayToSort) {
        //int[] result = new int[arrayToSort.length];
        int[] clonedArray = arrayToSort.clone();
        for (int n = clonedArray.length; n > 1; n--) {
            for (int i = 0; i < clonedArray.length - 1; i++) {
                if (clonedArray[i] > clonedArray[i + 1]) {
                    int buffer = clonedArray[i];
                    clonedArray[i] = clonedArray[i + 1];
                    clonedArray[i + 1] = buffer;
                }
            }
        }
        return clonedArray;
    }
}
