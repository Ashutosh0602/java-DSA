
// print char and substring
import java.util.Scanner;

public class stringQ {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = snc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        // System.out.println(s.length());
        for (int i = 0; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }
}
