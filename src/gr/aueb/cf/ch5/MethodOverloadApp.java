package gr.aueb.cf.ch5;

/**
 * Overload = Υπερφόρτωση σημαίνει το ίδιο
 * όνομα μεθόδου με διαφορετικές παραμέτρους.
 */
public class MethodOverloadApp {

    public static void main(String[] args) {
        int sum = 0;
        long result = 0;

        sum = add(1, 2);
        sum = add(3, 4, 6);
        result = add((long)1, 2);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded - Υπερφορτωμένη
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(long a, int b) {
        return a + b;
    }
}
