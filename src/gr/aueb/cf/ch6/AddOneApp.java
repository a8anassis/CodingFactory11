package gr.aueb.cf.ch6;

/**
 * Έστω ότι αναπαριστούμε μεγάλους ακέραιους σε μορφή πίνακα.
 * Θέλουμε να προσθέσουμε τη μονάδα.
 */
public class AddOneApp {

    public static void main(String[] args) {
        int[] bigNum = {9, 9, 9, 9, 8, 2, 3, 4, 5, 6, 7, 8};
        int[] result = addOne(bigNum);

        for (int el : result) {
            System.out.print(el);
        }
    }


    public static int[] addOne(int[] arr) {

        int[] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for  (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = carry;
        }

        return arrOut;
    }
}
