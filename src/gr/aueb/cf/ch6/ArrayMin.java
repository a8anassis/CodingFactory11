package gr.aueb.cf.ch6;

/**
 * Βρίσκει το ελάχιστο στοιχείο ενός πίνακα.
 */
public class ArrayMin {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }

    public static int getMinPositionV2(int[] arr) {
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }
}
