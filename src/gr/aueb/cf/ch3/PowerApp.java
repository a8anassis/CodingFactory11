package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το base^power. Ο χρήστης εισάγει
 * το base και το power και το πρόγραμμα υπολογίζει
 * το base^power και εκτυπώνει το αποτέλεσμα.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Εισάγετε το base και power");
        base = sc.nextInt();
        power = sc.nextInt();

        while (i <= power) {
            result *= base;     // result = result * base
            i++;
        }

        System.out.printf("%d^%d = %d\n", base, power, result);
    }
}
