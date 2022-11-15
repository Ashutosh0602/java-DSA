import java.util.Scanner;

public class nFibonnaci {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        System.out.println(nfibo(n));
    }

    public static int nfibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return nfibo(n - 1) + nfibo(n - 2);
    }
}
