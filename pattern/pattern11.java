import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int nno = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("\t" + nno);
                nno++;
            }
            System.out.println("");
        }
    }
}
