package gr.aueb.cf.ch6;

/**
 * Swaps two ints with arrays.
 */
public class SwapArray {

    public static void main(String[] args) {
        int[] arr = {1, 50};

        System.out.println("Before swap");
        System.out.println(arr[0] + ", " +  arr[1]);

        swap(arr);

        System.out.println("After swap");
        System.out.println(arr[0] + ", " +  arr[1]);
    }

    /**
     * Δέχεται πίνακα δύο στοιχείων και τα κάνει swap.
     *
     * @param arr   the input array.
     */
    public  static void swap(int[] arr) {
        if (arr == null || arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
