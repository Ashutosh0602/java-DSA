import java.util.Scanner;

public class lowerUpper {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String cse = "Invalid";
        char a = snc.next().charAt(0);

        for (char c = 'a'; c <= 'z'; ++c)
            if (a == c) {
                cse = "lowercase";
            }

        for (char c = 'A'; c <= 'Z'; ++c)
            if (a == c) {
                cse = "UPPERCASE";
            }

        System.out.println(cse);
    }
}
