package gr.aueb.cf.ch6;

/**
 * Reference copy is not safe copy since
 * it can change the original array.
 */
public class ArrRefCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] arr2 = getReference(arr);

        arr2[0] = 99;


    }

    public static int[] getReference(int[] arr) {
        return arr;
    }
}
