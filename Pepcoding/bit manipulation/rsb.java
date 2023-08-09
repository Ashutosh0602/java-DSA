import java.util.Scanner;

/**
 * rsb
 */
public class rsb {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int rsbm = n & (~n + 1);

        System.out.println(Integer.toBinaryString(rsbm));
    }
}