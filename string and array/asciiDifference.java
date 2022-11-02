import java.util.Scanner;

public class asciiDifference {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = snc.next();
        String newStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            int diff = (int) str.charAt(i + 1) - (int) str.charAt(i);
            newStr = newStr + str.charAt(i) + diff;
            if (i == str.length() - 2) {
                newStr = newStr + str.charAt(i + 1);
            }
        }
        System.out.println(newStr);
    }
}
