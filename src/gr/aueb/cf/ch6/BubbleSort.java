package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 8, 8, 9, 6, 10, 8, 3};
        int[] sorted = bubbleSort(arr);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {

        for  (int i = arr.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
