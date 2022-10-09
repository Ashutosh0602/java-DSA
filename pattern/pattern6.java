import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 0; i < 2 * n + 1; i++) {
            if (i < n) {

                for (int j = 0; j < n - i; j++) {
                    System.out.print(" *");
                }
                for (int j = 0; j < (n - (n - i)) * 2 + 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" *");
                }
            } else {
                for (int j = 0; j < i - n; j++) {
                    System.out.print(" *");
                }
                for (int j = 0; j < ((2 * n + 1) - i) * 2 - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < i - n; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}
