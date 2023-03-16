public class binarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        System.out.println(binary(array, 111));
    }

    public static int binary(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (item > arr[mid]) {
                lo = mid + 1;
            } else if (item < arr[mid]) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
