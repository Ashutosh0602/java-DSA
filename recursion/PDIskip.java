import java.util.Scanner;

public class PDIskip {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {
        System.out.println(n);
        if (n > 1) {
            pdi(n - 2);
            System.out.println(n - 1);
        }
    }
}
