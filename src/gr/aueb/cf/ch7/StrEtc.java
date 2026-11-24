package gr.aueb.cf.ch7;

public class StrEtc {

    public static void main(String[] args) {

        // Split
        String s = "Athens Uni of Eco and Bus";
        String[] tokens;

        tokens = s.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }

        // Concat
        String s1 = "Coding";
        String s2 = "Factory";
        String fullName1 = s1 + s2;
        String fullName2 = s1.concat(s2);

        // Replace
        String sDashed = s.replace(" ", "-");

        // Format
        char row = 'A';
        int col = 5;
        String seat = String.format("%c%d", row, col);

        // Trim
        String lastname = " Smith   ";
        String trimmedLastname = lastname.trim();

        // To upper and to lower
        String lower = "coding factory";
        String upper = "CODING FACTORY";

        boolean isEqualIgnoreCase = lower.toUpperCase()
                                         .equals(upper.toUpperCase());  // Normalization
    }
}
