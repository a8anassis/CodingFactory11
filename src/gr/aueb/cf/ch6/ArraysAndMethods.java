package gr.aueb.cf.ch6;

/**
 * Πως περνάμε ένα πίνακα ως τυπική παράμετρο
 * σε μία μέθοδο και πως καλούμε μία μέθοδο περνώντας
 * πίνακα ως πραγματική παράμετρο.
 */
public class ArraysAndMethods {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 14, 71, 5, 100 };

        printArray(arr);

        printArray(arr, 0, arr.length);
        printArray(arr, 1, 5);
        printArray(arr, 2, 3);
    }

    /**
     * Prints the elements of an array.
     *
     * @param arr   the input array to print.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    /**
     * Εκτυπώνει ένα slice του πίνακα arr από low έως high - 1.
     * Το high είναι exclusive.
     *
     * @param arr   the input array to print.
     * @param low   the starting index.
     * @param high  the end index (exclusive)
     */
    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length) return;
        if (low > high) return;

        for (int i = low; i < high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
