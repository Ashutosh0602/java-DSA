import java.util.Scanner;

public class stringCompression {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = snc.next();
        char c = 'x';
        String nstr = "";
        boolean ch = true;
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (ch) {
                count = 1;
                c = str.charAt(i);
                ch = false;
            } else {
                if (c == str.charAt(i)) {
                    count++;
                    if (i == str.length() - 1)
                        nstr = nstr + c + count;
                    ;
                } else {
                    if (count > 1) {
                        nstr = nstr + c + count;
                    } else {
                        nstr = nstr + c;
                    }
                    count = 1;
                    c = str.charAt(i);
                    if (i == str.length() - 1)
                        nstr = nstr + c;
                    ;
                }
            }
        }
        System.out.println(nstr);
    }
}
