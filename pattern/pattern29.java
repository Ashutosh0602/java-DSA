
// pattern mountain
import java.util.Scanner;

public class pattern29 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Math.abs(snc.nextInt());
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + "    ");
            }
            for (int j = 0; j <= n - (2 * (i - 1)); j++) {
                System.out.print("     ");
            }
            for (int j = i; j > 0; j--) {
                if (j == n) {
                    System.out.print("");
                } else {
                    System.out.print(j + "    ");
                }
            }
            System.out.println("");
        }
    }
}
