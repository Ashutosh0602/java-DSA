import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i < n + 1; i++) {
            int a = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + a);
                a++;
            }
            int b = a - 1;
            for (int k = 0; k < a - 2; k++) {
                b--;
                System.out.print(" " + b);
            }
            System.out.println("");
        }
    }
}
