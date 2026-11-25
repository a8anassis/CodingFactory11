package gr.aueb.cf.ch7;

import java.util.Locale;

/**
 * Διάφορες λειτουργίες με Strings.
 */
public class StrEtc {

    public static void main(String[] args) {

        // Split a string into an array of strings
        String s = "Athens        Uni of Eco and Business";
        String[] lexemes;

        lexemes = s.split(" +");        // patterns

        for (String lexeme : lexemes) {
            System.out.println(lexeme);
        }

        // Concatenate strings
        String s1 = "Coding";
        String s2 = " Factory";
        String s3 = s1 + s2;
        String s4 = s1.concat(" ").concat(s2);      // chaining

        // Replace
        String s5 = s.replace(" ", "_");
        String s6 = s5.replaceAll(" +", "_");

        // Format
        char row = 'A';
        int col = 12;
        String seat = String.format("%c%d", row, col);

        // Trim
        String s7 = "   Coding Factory   ";
        String s8 = s7.trim();

        // To Upper/Lower Case
        String s9 = "Coding Factory";
        String s10 = "coding factory";

        // Normalize
        boolean areEqualIgnoringCase = s9.toUpperCase().equals(s10.toUpperCase());  // equalsIgnoreCase


    }
}
