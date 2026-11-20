package gr.aueb.cf.ch6;

/**
 * Μετράει το πλήθος των εμφανίσεων ενός
 * ακεραίου μέσα σε ένα πίνακα.
 */
public class ArrayCount {

    public static void main(String[] args) {

    }

    /**
     * Υπολογίζει τον πλήθος των εμφανίσεων ενός στοιχείου
     * σε ένα δοσμένο πίνακα.
     *
     * @param arr       the input array.
     * @param value     the value to count.
     * @return          the count of occurrences of the value in the array,
     *                  or -1 if the array is null
     */
    public static int getCount(int[] arr, int value) {
        if (arr == null) return -1;
        int count = 0;

        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }
}
