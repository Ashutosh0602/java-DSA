
// Increasing and decreasing patterns
import java.util.Scanner;

public class pattern32 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Math.abs(snc.nextInt());
        int nInt = 0;
        boolean bool = true;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = snc.nextInt();
            if (i == 0) {
                nInt = a;
            } else {
                if (a >= nInt) {
                    count++;
                } else if (a <= nInt) {
                    count--;
                }
                nInt = a;
            }
        }
        if (Math.abs(count) == n - 1) {
            System.out.println(bool);
        } else {
            System.out.println(!bool);
        }
    }
}
