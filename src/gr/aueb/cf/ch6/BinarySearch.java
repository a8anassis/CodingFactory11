package gr.aueb.cf.ch6;

/**
 * Στο binary search ο πίνακας πρέπει να είναι ταξινομημένος.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int position = binarySearch(arr, 8, 0, arr.length - 1);

        if (position == -1) {
            System.out.println("-1");
        } else  {
            System.out.println("Βρέθηκε στη θέση: " + (position + 1));
        }


    }

    public static int binarySearch(int[] arr, int value, int low, int high) {

        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (arr[mid] > value) return binarySearch(arr, value, low, mid - 1);
        else return binarySearch(arr, value, mid + 1, high);
    }
}
