package gr.aueb.cf.ch7;

/**
 * Διάφορες λειτουργίες με Strings.
 */
public class StrEtc {

    public static void main(String[] args) {

        // Split a string into an array of strings
        String s = "Athens      Uni    of Eco and Business";
        String[] lexemes;

        lexemes = s.split(" +");        // patterns

        for (String lexeme : lexemes) {
            System.out.println(lexeme);
        }
    }
}
