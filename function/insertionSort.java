public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 34, 13, 56, 12, 8, 1, 67 };

        // for (int i = 1; i < arr.length; i++) {
        // int count = i - 1;
        // if (arr[i] < arr[count]) {
        // int temp = arr[i];
        // arr[i] = arr[count];
        // arr[count] = temp;
        // for (int j = count; j > 0; j--) {
        // if (arr[j - 1] > arr[j]) {
        // int anot = arr[j];
        // arr[j] = arr[j - 1];
        // arr[j - 1] = anot;
        // }
        // }
        // }
        // }

        for (int count = 1; count < arr.length; count++) {
            int val = arr[count];

            int j = count - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }

        for (int val : arr) {
            System.out.println(val);
        }
    }
}
