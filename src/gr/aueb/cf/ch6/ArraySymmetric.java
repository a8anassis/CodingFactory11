package gr.aueb.cf.ch6;

/**
 * Ένας πίνακας είναι συμμετρικός αν διαβάζεται το ίδιο
 * από αριστερά προς τα δεξιά και από δεξιά προς τα αριστερά.
 * Για παράδειγμα, ο πίνακας {1, 2, 3, 2, 1} είναι συμμετρικός.
 * Και ο πίνακας {1, 2, 3, 3, 2, 1} είναι συμμετρικός.
 */
public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(isArraySymmetric(arr));
        System.out.println(isArraySymmetric(arr2));
        System.out.println(isArraySymmetric(arr3));

        System.out.println(isArraySymmetricV2(arr));
        System.out.println(isArraySymmetricV2(arr2));
        System.out.println(isArraySymmetricV2(arr3));
    }


    public static boolean isArraySymmetric(int[] arr) {
        if  (arr == null) return false;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Ελέγχει αν ένας πίνακας είναι συμμετρικός.
     *
     * @param arr Ο πίνακας ακεραίων.
     * @return true αν ο πίνακας είναι συμμετρικός, αλλιώς false.
     */
    public static boolean isArraySymmetricV2(int[] arr) {
        if (arr == null) return false;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
