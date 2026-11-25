package gr.aueb.cf.ch7;

/**
 * Επιστρέφει την πρώτη θέση εμφάνισης ενός χαρακτήρα
 * ή ενός sub-string μέσα σε ένα άλλο String.
 */
public class StrIndexOf {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOding = s.indexOf("x");
        System.out.println("The index of 'o' is: " + positionOding);

        int positionofLasto = s.lastIndexOf("o");
        System.out.println("The last index of 'o' is: " + positionofLasto);

        String filename = "hello.txt";
        String extension = filename.substring(filename.lastIndexOf(".") + 1);
        System.out.println("The extension is: " + extension);
        String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf("."));
        System.out.println("The filename without extension is: " + filenameWithoutExtension);

        // charAt
        char ch = s.charAt(0);
        System.out.println("The first character is: " + ch );
    }
}
