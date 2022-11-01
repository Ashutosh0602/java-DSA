import java.util.Scanner;

public class stringCheck {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String cse = "I";
        char a = snc.next().charAt(0);

        for (char c = 'a'; c <= 'z'; ++c)
            if (a == c) {
                cse = "L";
            }

        for (char c = 'A'; c <= 'Z'; ++c)
            if (a == c) {
                cse = "U";
            }

        System.out.println(cse);
    }
}
