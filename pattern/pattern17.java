import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n < 0) {
            n = -n;
        }
        if (n > 0 && n <= 1000) {

            System.out.println("1");

            for (int i = 0; i < n - 1; i++) {
                System.out.print(String.format("%s", i + 1));
                for (int j = 0; j < i; j++) {
                    System.out.print("0");
                }
                System.out.print(String.format("%s", i + 1));
                System.out.println("");
            }
        }
    }
}
