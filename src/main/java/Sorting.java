/**
 * Created by snaked on 19.09.16.
 */

import java.util.Random;

public class Sorting {
    public static void main(String [] args) {

    }

    public static int[] generateArray(int numberOfElements, int minValue, int maxValue) {
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());
        int[] generatedArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements - 1; i++) {
            generatedArray[i] = rnd.nextInt(Integer.MAX_VALUE);
        }
        return generatedArray;
    }
}
