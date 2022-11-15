import java.util.Scanner;

public class firstIndex {
    static Scanner snc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
        int data = snc.nextInt();
        System.out.println(first(arr, 0, data));

    }

    public static int first(int[] arr, int index, int data) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == data) {
            return index;
        } else {
            int state = first(arr, index + 1, data);
            return state;
        }
    }
}
