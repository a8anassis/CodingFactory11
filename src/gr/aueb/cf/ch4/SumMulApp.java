package gr.aueb.cf.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο
 * των 10 πρώτων ακεραίων.
 */
public class SumMulApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;       // sum = sum + i;
            mul *= i;       // mul = mul * i
        }

        System.out.println("Το άθροισμα είναι: " + sum);
        System.out.println("Το γινόμενο είναι: " + mul);
    }
}
