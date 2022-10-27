
// fibonacci pattern (pattern 4)
import java.util.Scanner;

public class pattern28 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Math.abs(snc.nextInt());

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + "    ");
                a = b;
                b = c;
                c = b + a;
            }
            System.out.println("");
        }
    }
}
