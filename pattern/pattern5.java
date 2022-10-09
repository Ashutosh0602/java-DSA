import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i < 2 * n; i++) {
            if (i < n + 1) {
                for (int j = 0; j < i; j++) {

                    System.out.print(" *");
                }
            } else {
                for (int j = 0; j < 2 * n - i; j++) {

                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}