import java.util.Scanner;

public class factorial {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        System.out.println(factor(n));
    }

    public static int factor(int n) {
        if (n > 1) {
            return n * factor(n - 1);
        } else {
            return n;
        }
    }
}
