package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Αναζήτηση ενός στοιχείου σε ένα πίνακα.
 */
public class ArraySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 0;
        int position = 0;

        System.out.println("Εισάγετε μία τιμή αναζήτησης: ");
        value = in.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Η τιμή δεν βρέθηκε.");
        } else {
            System.out.println("Τιμή: " + arr[position] + " βρέθηκε στη θέση: " + (position + 1));
        }
    }

    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    public static int getPositionV2(int[] arr, int value, int position) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;               // early exit
            }
        }

        return -1;
    }
}
