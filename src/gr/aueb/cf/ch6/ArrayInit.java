package gr.aueb.cf.ch6;

/**
 * Array Init & Populate
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr1 = new int[5];                    // Default values: 0
        int[] arr2 = {1, 2, 7, 14, 71, 5, 100};     // Unsized initialization
        int[] arr3 = new int[] {4, 8, 7, 45, 67};          // Array initializer

        arr1[0] = 2;
        arr1[1] = 3;
        arr1[2] = 4;
        arr1[3] = 5;
        arr1[4] = 6;
        // arr1[5] = 7;    // IndexOutOfBoundsException


        System.out.println("arr1[0]" + arr1[0]);
        System.out.println("arr1[1]" + arr1[1]);
        System.out.println("arr1[2]" + arr1[2]);
        System.out.println("arr1[3]" + arr1[3]);
        System.out.println("arr1[4]" + arr1[4]);
        System.out.println("Array Length: " + arr1.length);

    }
}
