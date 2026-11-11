package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη του base^power με μέθοδο.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Εισάγετε τη βάση και τη δύναμη:");
        base = sc.nextInt();
        power = sc.nextInt();

        result = pow(base, power);

        System.out.printf("%d^%d = %d\n", base, power, result);
    }

    /**
     * Calculates a^b.
     *
     * @param a     the base.
     * @param b     the exponent.
     * @return      the result of a^b.
     */
    public static int pow(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }
}
