package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των ακεραίων
 * από το 1 έως το 10.
 */
public class SumApp {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;       // sum = sum + i;
            i++;
        }

        System.out.println("Το άθροισμα είναι: " + sum);
    }
}
