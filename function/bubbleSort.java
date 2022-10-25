public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 24, 45, 12, 68, 23, 87 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int val : arr) {

            System.out.println(val);
        }
    }
}
