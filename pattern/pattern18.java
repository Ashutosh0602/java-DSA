
// Van Neuman pattern
import java.util.Scanner;

public class pattern18 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }

        int l = 0;
        while (l < array.length) {
            String s = Integer.toString(array[l]);
            String[] arr = s.split("");
            int a = 0;
            for (int i = 0; i < arr.length; i++) {
                a = a + Integer.parseInt(arr[i]) * (int) Math.pow(2.00, arr.length - 1 - i);
            }
            System.out.println(a);
            l++;
        }
    }
}
