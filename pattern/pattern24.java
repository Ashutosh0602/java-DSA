
// Pattern with zeros
import java.util.Scanner;

public class pattern24 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Math.abs(snc.nextInt());

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(1 + "    ");
            } else {
                System.out.print(i + 1 + "    ");

                for (int j = 1; j < i; j++) {
                    System.out.print(0 + "    ");
                }
                System.out.print(i + 1 + "    ");
            }
            System.out.println("");
        }
    }
}
