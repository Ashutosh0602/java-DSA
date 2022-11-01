import java.util.Scanner;

public class ultraFast {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = snc.nextInt();
        snc.nextLine(); // because for loop is not accepting the first input cycle there is some logic
        // of input nextint();
        if (n <= 100) {

            for (int i = 0; i < n; i++) {
                String end = "";
                String[] s = snc.nextLine().split(" ");
                String[] str1 = s[0].split("");
                String[] str2 = s[1].split("");
                String[] main;
                if (str1.length > str2.length)
                    main = str2;
                else
                    main = str1;
                for (int j = 0; j < main.length; j++) {
                    if (Integer.parseInt(str1[j]) == Integer.parseInt(str2[j])) {
                        end = end + "0";
                    } else {
                        end = end + "1";
                    }
                }
                System.out.println(end);
            }
        }
    }
}
