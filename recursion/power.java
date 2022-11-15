import java.util.Scanner;

public class power {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        int m = snc.nextInt();
        System.out.println(pow(n, m));
    }

    public static int pow(int n, int m) {
        if (m > 1) {
            return n * pow(n, m - 1);
        } else {
            return n;
        }
    }
}
