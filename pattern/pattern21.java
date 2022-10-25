
// Delhi's odd even
import java.util.Scanner;

public class pattern21 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        if (n > 0) {

            for (int j = 0; j < n; j++) {
                int k = scn.nextInt();
                String[] sarr = String.valueOf(k).split("");
                int o = 0;
                int e = 0;
                for (int m = 0; m < sarr.length; m++) {
                    if (Integer.parseInt(sarr[m]) % 2 == 0) {
                        e = e + Integer.parseInt(sarr[m]);

                    } else {
                        o = o + Integer.parseInt(sarr[m]);
                    }
                }
                // System.out.println(o);
                // System.out.println(e);
                if (o % 3 == 0 || e % 4 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}