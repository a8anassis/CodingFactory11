package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων με τη
 * χρήση μεθόδου.
 */
public class AddMethodApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;

        sum = add(num1, num2);

        System.out.println("Το άθροισμα είναι: " + sum);
    }

    public static int add(int a, int b) {
//        int sum = 0;
//
//        sum = a + b;
//
//        return sum;

        return a + b;
    }
}
