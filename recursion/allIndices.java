// Not completed

import java.util.Scanner;

public class allIndices {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] narr = null;
        int[] arr = { 1, 2, 3, 4, 3, 2, 5, 6, 7, 3 };
        int data = snc.nextInt();
        index(arr, data, 0);
        for (int val : narr) {
            System.out.println(val);
        }
    }

    public static int[] index(int[] arr, int data, int ind) {
        if (ind == arr.length) {
            return narr;
        }
        if (arr[ind] == data) {
            // narr[0] = ind;
            return narr;
        } else {
            int[] repeat = index(arr, data, ind + 1);
            return repeat;
        }
    }
}
