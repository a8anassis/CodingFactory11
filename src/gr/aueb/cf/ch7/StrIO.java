package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * String Input/Output operations
 */
public class StrIO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";


        System.out.println("Εισάγετε δύο strings: ");
        str1 = sc.next();   // reads until the first whitespace (whitespace, tab, newline)
        str2 = sc.nextLine();   // reads until the first newline
    }
}
