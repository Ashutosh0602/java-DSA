import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.print("1");
                if (i % 2 == 0) {
                    for (int j = 0; j < ((i / 2) - 1) * 2; j++) {
                        System.out.print("0");
                    }
                } else {
                    for (int j = 0; j < i - 2; j++) {
                        System.out.print("1");
                    }
                }
                System.out.print("1");
                System.out.println("");
            }
        }
    }
}
