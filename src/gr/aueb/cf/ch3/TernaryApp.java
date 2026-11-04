package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό
 * του μικρότερου μεταξύ δύο ακεραίων.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        // Data input
        System.out.println("Εισάγετε δύο ακεραίους");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // Process data

        // Conditional assignment
//        if  (num1 < num2) {
//            min = num1;
//        } else {
//            min = num2;
//        }

        min = (num1 < num2) ? num1 : num2;

        System.out.printf("Ο μικρότερος μεταξύ %d και %d είναι ο %d",  num1, num2, min);
    }
}
