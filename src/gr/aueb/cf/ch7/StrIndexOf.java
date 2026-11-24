package gr.aueb.cf.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf("oding");            //  1
        int positionOfLasto = s.lastIndexOf('o');    // 11
    }

    // Μέθοδος που επιστρέφει την κατάληξη του ονόματος
    // ενός αρχείου, π.χ., αν έχουμε coding.txt -> txt
    public static String getExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        return filename.substring(dotIndex + 1);
    }
}
