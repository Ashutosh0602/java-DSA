import java.util.Scanner;

public class factorization {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();

        int div = 2;
        while (n != 1) {
            if (n % div == 0) {
                n = n / div;
                System.out.println(div);
            } else {
                div++;
            }

        }
    }
}
