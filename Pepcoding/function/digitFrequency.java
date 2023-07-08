import java.util.Scanner;

/**
 * digitFrequency
 */
public class digitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int ret = frequency(n, k);
        System.err.println(ret);

    }

    public static int frequency(int digit, int no) {
        int temp = digit;
        int count = 0;
        while (temp != 0) {
            if (temp % 10 == no) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}