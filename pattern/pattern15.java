import java.util.Scanner;

// pattern number and stars
public class pattern15 {
    // public static void main(String[] args) {
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // if (n < 0) {
    // n = -n;
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print(j + 1 + " ");

    // }
    // if (i > 0) {

    // for (int k = 0; k < 2 * i - 1; k++) {
    // System.out.print("* ");
    // }
    // }
    // System.out.println("");
    // }

    // }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n > 0 && n < 10) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(j + 1 + "");

                }
                for (int k = 1; k < n - i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }
    }
}
