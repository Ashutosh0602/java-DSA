import java.util.Scanner;

public class pattern31 {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int no = Math.abs(snc.nextInt());
        String[] sarr = String.valueOf(no).split("");
        double check = 0;
        int len = sarr.length;
        for (String val : sarr) {
            check = check + Math.pow((double) Integer.parseInt((val)), (double) len);
        }
        if ((int) check == no) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
