package gr.aueb.cf.ch7;

public class StrInit {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = new String("Athens");   // do not use

        System.out.println(s1);
        System.out.printf("%s\n", s1);
        System.out.println("Length: " + s1.length());
    }
}
