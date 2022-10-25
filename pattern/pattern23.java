import java.util.Scanner;

public class pattern23 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        String[] str = String.valueOf(n).split("");
        for (int i = 0; i < str.length; i++) {
            System.out.print(Integer.parseInt(str[str.length - i - 1]));
        }
    }
}
