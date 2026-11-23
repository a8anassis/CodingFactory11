package gr.aueb.cf.ch6;

/**
 * Ταξινομεί ένα πίνακα με τη μέθοδο
 * του Selection Sort.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 8, 8, 9, 6, 10, 8, 3};
        int[] sorted = selectionSort(arr);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        int minPosition;
        int minValue;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            minValue = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minPosition = j;
                    minValue = arr[j];
                }
            }
            swap(arr, minPosition, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
