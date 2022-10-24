import java.util.Scanner;

public class pattern19 {
    public static int a = 0;

    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        while (true) {
            int n = snc.nextInt();

            if (n >= -1000 && n <= 1000) {
                a = a + n;
                if (a < 0) {
                    break;
                }
                System.out.println(n);
            }
        }
    }
}
