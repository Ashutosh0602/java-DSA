import java.util.Scanner;

/**
 * sum2array
 */
public class sum2array {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];

        int carry = 0;
        // adding the arrays element by element and storing in result array
        for (int i = sum.length - 1; i >= 0; i--) {
            int temp = 0;
            temp = a1[i] + a2[i];

            sum[i] = (temp + carry) % 10;
            carry = (temp + carry) / 10;
        }
        if (carry == 0) {
            System.out.println("");
        } else {
            System.out.print(carry);
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]);
        }
    }

}