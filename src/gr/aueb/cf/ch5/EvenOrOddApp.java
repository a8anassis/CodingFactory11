package gr.aueb.cf.ch5;

/**
 * Ορίζει τις μεθόδους isEven και isOdd για
 * τον έλεγχο ενός ακεραίου αν είναι άρτιος
 * ή περιττός.
 */
public class EvenOrOddApp {

    public static void main(String[] args) {
        int num1 = 10;
        boolean isEven = false;

        isEven = isEven(num1);

        System.out.println(isEven);
    }

    /**
     * Calculates if an int is even or not.
     *
     * @param a     the int to evaluate.
     * @return  true if the param is even, false otherwise.
     *
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }
}
