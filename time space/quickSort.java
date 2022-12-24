public class quickSort {
    public static void main(String[] args) {

    }

    public static void sort(int[] arr, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int pivot = arr[mid];

        int left = lo;
        int right = hi;

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        sort(arr, lo, right);
        sort(arr, left, hi);
    }
}
