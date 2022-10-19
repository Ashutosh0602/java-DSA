import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        for (int i = 0; i < 2 * n + 1; i++) {
            int s = n;
            if (i < n + 1) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(s + " ");
                    s--;
                }
                for (int k = 1; k < (2 * n + 1) - (i * 2) - 1; k++) {
                    System.out.print("  ");
                }
                for (int m = n; m >= n - i; m--) {
                    if (n - i - 1 + (n - m + 1) > 0) {
                        System.out.print(n - i - 1 + (n - m + 1) + " ");
                    }
                }
            } else {
                for (int j = 0; j < (2 * n + 1) - i; j++) {
                    System.out.print(s + " ");
                    s--;
                }
                for (int k = 1; k < (i * 2) - (2 * n + 1) + 1; k++) {
                    System.out.print("  ");
                }
                for (int m = i - n; m < n + 1; m++) {
                    System.out.print(m + " ");
                }
            }
            System.out.println("");
        }
    }
}
