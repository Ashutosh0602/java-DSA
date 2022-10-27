
// count digits
import java.util.Scanner;

public class pattern30 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = Math.abs(snc.nextInt());
        int n = Math.abs(snc.nextInt());
        String[] sarr = String.valueOf(number).split("");
        int count = 0;
        for (String val : sarr) {
            if (Integer.parseInt(val) == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
