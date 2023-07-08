import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        int k = snc.nextInt();

        int pow = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            pow++;
        }

        for (int i = 0; i < k; i++) {
            int rem = n % 10;
            int qut = n / 10;
            n = qut + (rem * (int) Math.pow(10, pow - 1));

        }

        System.out.println(n);
    }
}
