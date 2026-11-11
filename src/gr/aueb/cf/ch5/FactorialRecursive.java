package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το παραγοντικό του n
 * με αναδρομικό τρόπο.
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        int n = 5;
        int result = 0;

        result = facto(n);

        System.out.println(result);
    }

    public static int facto(int n) {
//        if (n <= 1) return 1;
//        return n *  facto(n - 1);

        return (n <= 1) ? 1 : n *  facto(n - 1);
    }
}
