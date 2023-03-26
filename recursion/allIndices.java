// Not completed

import java.util.ArrayList;
import java.util.Scanner;

public class allIndices {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> narr = new ArrayList<Integer>();
        int[] arr = { 1, 2, 3, 4, 3, 2, 5, 6, 7, 3 };
        int data = snc.nextInt();
        int count = index(arr, data, 0, 0);
        System.out.println(count);
    }

    // public static int index(int[] arr, int data, int ind, int count) {
    // if (arr[ind] == data) {
    // System.out.println(ind);
    // count += 1;
    // }
    // if (ind == arr.length - 1) {
    // return count;
    // }
    // int repeat = index(arr, data, ind + 1, count);
    // return repeat;
    // }
    public static int index(int[] arr, int data, int ind, int count) {
        if (arr[ind] == data) {
            count += 1;
        }
        if (ind == arr.length - 1) {
            return count;
        }
        int repeat = index(arr, data, ind + 1, count);
        return repeat;
    }
}
