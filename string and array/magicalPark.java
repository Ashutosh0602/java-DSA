import java.util.Scanner;

public class magicalPark {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] s = snc.nextLine().split(" ");
        int S = Integer.parseInt(s[3]);

        for (int i = 0; i < Integer.parseInt(s[0]); i++) {
            String[] es = snc.nextLine().split(" ");
            for (int j = 0; j < es.length; j++) {
                if (j < es.length - 1) {
                    if (es[j].charAt(0) == '.') {
                        S = S - 3;
                    } else if (es[j].charAt(0) == '*') {
                        S = S + 4;
                    } else if (es[j].charAt(0) == '#') {
                        break;
                    }
                } else {
                    if (es[j].charAt(0) == '.') {
                        S = S - 2;
                    } else if (es[j].charAt(0) == '*') {
                        S = S + 5;
                    } else if (es[j].charAt(0) == '#') {
                        break;
                    }
                }
            }
        }
        if (Math.abs(Integer.parseInt(s[2])) <= S) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
    }
}
