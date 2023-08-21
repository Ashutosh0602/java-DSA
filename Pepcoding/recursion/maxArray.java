/**
 * maxArray
 */
public class maxArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int val = maxOfArray(arr, ++idx);

        return Math.max(arr[idx], val);
    }
}