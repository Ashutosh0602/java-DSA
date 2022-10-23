import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        int r = snc.nextInt();

        int i = 1;
        int c = 1;
        while (c <= n) {
            if ((3 * i + 2) % r != 0) {
                System.out.println(3 * i + 2);
                c++;
            }
            i++;
        }
    }
}
