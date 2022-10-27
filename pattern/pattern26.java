
// check prime
import java.util.Scanner;

public class pattern26 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        String s = "prime";
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                s = "Not Prime";
                break;
            }
        }
        System.out.println(s);
    }
}
