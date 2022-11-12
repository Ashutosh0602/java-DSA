import java.util.Scanner;

public class sanketString {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int k = snc.nextInt();
        String str = snc.next();
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            }
        }
        if (countA >= str.length() - countA) {
            if (k >= str.length() - countA) {
                System.out.println(str.length());
            } else {
                System.out.println(countA + k);
            }
        } else {
            if (k >= countA) {
                System.out.println(str.length());
            } else {
                System.out.println(str.length() - countA + k);
            }
        }
    }
}
