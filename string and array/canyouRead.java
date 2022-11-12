import java.util.Scanner;

public class canyouRead {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = snc.nextLine();
        int start = 1;
        while (start <= str.length()) {
            String nstr = "";
            int upperCount = 0;
            for (int i = start - 1; i < str.length(); i++) {
                if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                    upperCount++;
                }
                if (upperCount == 2) {
                    break;
                }
                nstr = nstr + str.charAt(i);
                start++;
            }
            System.out.println(nstr);
        }
    }
}
