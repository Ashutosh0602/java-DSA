import java.util.Scanner;

// this code is important
public class isSorted {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sort(arr, 0));
    }

    public static boolean sort(int[] arr, int n) {
        if (n == arr.length - 1)
            return true;
        if (arr[n] <= arr[n + 1]) {
            Boolean state = sort(arr, n + 1);
            return state;
        } else {
            return false;
        }
    }
}
