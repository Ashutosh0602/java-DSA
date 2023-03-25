public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 10, 20 };
        sort(arr, 0, arr.length - 1);
        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static void sort(int[] arr, int si, int li) {
        if (li == 0) {
            return;
        }
        if (si == li) {
            sort(arr, 0, li - 1);
            return;
        }
        if (arr[si] > arr[si + 1]) {
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }
        sort(arr, si + 1, li);
    }

}
