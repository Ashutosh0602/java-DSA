import java.util.Scanner;

public class patternr7 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int k = 0; k < n * 2 - 1; k++) {
            if (k < n) {

                for (int i = 0; i < n - k - 1; i++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < k * 2 + 1; j++) {
                    System.out.print(" *");
                }
            } else {
                for (int i = 0; i < k - n + 1; i++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < ((n * 2 - 1) - k) * 2 - 1; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println(" ");
        }
    }
}
