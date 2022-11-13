import java.util.Scanner;

/*
 * recusrsion1
 */
public class recusrsion1 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        reverse(n);
    }

    public static void reverse(int n) {
        // System.out.println(n);
        // n--;
        if (n > 1) {
            reverse(n - 1);
        }
        System.out.println(n);
    }
}