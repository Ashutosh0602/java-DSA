import java.util.Scanner;

public class canyouRead {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = snc.nextLine();
        int start = 0;
        while (start <= str.length()) {
            String nStr = "";
            for (int i = start; i < str.length(); i++) {
                if (i == start) {
                    nStr = nStr + str.charAt(i);
                    // start = start + 1;
                } else {
                    if (Character.toUpperCase(str.charAt(i)) == str.charAt(i)) {
                        start = start + nStr.length();
                        break;
                    }
                    nStr = nStr + str.charAt(i);
                }
            }
            System.out.println(nStr);
        }
        System.out.println(str);
    }
}
