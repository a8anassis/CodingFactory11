package gr.aueb.cf.solutions.ch3;

import java.util.Scanner;

/** Ελέγχει αν ένα έτος είναι δίσεκτο.
 *  Δίσεκτο είναι ένα έτος αν
 *  Διαιρείται με 400, Ή
 *  διαιρείται με το 4 ΚΑΙ όχι με το 100
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert the year");
        year = in.nextInt();

        /*if (year % 400 == 0 || (year % 4 == 0 && year % 100 !                                                                                                                 = 0)) {
            isLeap = true;
        }*/

        isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }
}
