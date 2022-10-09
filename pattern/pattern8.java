import java.rmi.ConnectIOException;
import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("  ");
            }
            if (i < n) {

                for (int j = 0; j < ((n * 2 - 1) - ((n - i) * 2 - 1)) / 2; j++) {
                    System.out.print(" *");
                }
            } else {
                for (int j = 0; j < ((n * 2 - 1) - ((n - i) * 2 - 1)) / 2 - 1; j++) {
                    System.out.print(" *");
                }

            }
            System.out.println("");
        }
    }
}
