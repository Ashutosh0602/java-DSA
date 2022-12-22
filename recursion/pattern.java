import java.util.Scanner;

public class pattern {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        patr(n);
    }

    public static void patr(int n) {
        if (n > 1) {
            patr(n - 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(' ');
    }
}
