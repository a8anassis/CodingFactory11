package gr.aueb.cf.ch7;

/**
 * Δοθέντος ενός String, μετατρέπει σε κεφαλαία-πεζα εναλλάξ.
 * Παράδειγμα: "Coding Factory" -> "CoDiNg FaCtOrY"
 *
 * Character wrapper class ->
 * Character.isLetter(ch)
 * Character.toUpperCase()
 * Character.toLowerCase()
 *
 */
public class UpperAndLowerCase {

    public static void main(String[] args) {
        String inputStr = "Coding Factory";
        String result = getUpperAndLowerCase(inputStr);
        System.out.println(result);
    }

    public static String getUpperAndLowerCase(String inputStr) {
        char ch;
        int letterIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);
            if (Character.isLetter(ch)) {
                ch = letterIndex % 2 == 0
                        ? Character.toUpperCase(ch)
                        : Character.toLowerCase(ch);
                letterIndex++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
