import java.util.Scanner;

/**
 * hanoi
 */
public class hanoi {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        int n = sys.nextInt();
        int t1 = sys.nextInt();
        int t2 = sys.nextInt();
        int t3 = sys.nextInt();
        toh(n, t1, t2, t3);
    }

    public static void toh(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
        toh(n - 1, t1, t3, t2);
        System.out.println("move from " + t1 + " to" + t2 + "with disk:" + n);
        toh(n - 1, t3, t2, t1);
    }
}