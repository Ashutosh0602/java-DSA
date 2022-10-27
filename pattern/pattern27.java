
// pattern triangle
import java.util.Scanner;

public class pattern27 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Math.abs(snc.nextInt());
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print("      ");
            }
            for (int j = 0; j < ((2 * i + 1) / 2) + 1; j++) {
                System.out.print(i + j + 1 + "     ");
            }
            for (int j = ((2 * i + 1) - 1); j > i; j--) {
                System.out.print(j + "     ");
            }

            System.out.println("");
        }
    }
}
