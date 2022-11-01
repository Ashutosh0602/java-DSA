import java.util.Scanner;

public class palindrom {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = snc.next();
        String status = "true";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                status = "false";
                break;
            }
        }
        System.out.println(status);
    }
}
