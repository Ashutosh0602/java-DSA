import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" 1");
            }
            System.out.println("");
        }
    }
}
