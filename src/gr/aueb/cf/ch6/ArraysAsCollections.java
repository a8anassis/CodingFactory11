package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Βασικές πράξεις σε συλλογές όπως οι πίνακες:
 * - Filtering
 * - Mapping
 * - Reduce
 */
public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                arrayToReturn[count++] = num;
            }
        }

        return Arrays.copyOf(arrayToReturn, count);
    }

    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    public static int sum(int[] arr) {
        if  (arr == null || arr.length == 0) return 0;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        return  sum(arr) / (double) arr.length;
    }
}
