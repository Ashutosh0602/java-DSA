import java.util.Scanner;

/**
 * stringComp
 */
public class stringComp {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String n = snc.nextLine();
        char[] arrr = n.toCharArray();
        // n.
        // System.out.println(n.contains("a"));
        for (char val : arrr) {
            System.out.println(val);
        }

    }
}