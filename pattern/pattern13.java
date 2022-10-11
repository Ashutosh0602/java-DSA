import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i < n * 2; i++) {
            if (i <= (n * 2 / 2)) {

                int a = i;
                for (int j = 0; j < i; j++) {
                    System.out.print(" " + i);
                    if (a - 1 > 0 && a - 1 < i) {
                        System.out.print(" *");
                        a--;
                    }
                }
                System.out.println("");
            } else {
                int a = n * 2 - i;
                for (int j = 0; j < n * 2 - i; j++) {
                    System.out.print(" " + (n * 2 - i));
                    if (a - 1 > 0 && a - 1 < i) {
                        System.out.print(" *");
                        a--;
                    }
                }
                System.out.println("");

            }

        }
    }
}
