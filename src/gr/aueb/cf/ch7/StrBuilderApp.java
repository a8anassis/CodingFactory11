package gr.aueb.cf.ch7;

/**
 * StringBuilder operations.
 */
public class StrBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        String reversed = "";

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        result = sb.toString();
        reversed = sb.reverse().toString();
    }
}
