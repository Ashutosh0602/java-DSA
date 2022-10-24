public class binarysort {
    public static void main(String[] args) {
        int[] array = { 3, 5, 7, 9, 10, 13, 15, 17, 19, 20, 35, 67, 89 };
        System.out.println(sort(array, 35));
    }

    public static int sort(int[] arr, int n) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < n) {
                lo = mid + 1;
            } else if (arr[mid] > n) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
