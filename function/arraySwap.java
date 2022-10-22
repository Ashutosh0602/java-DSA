public class arraySwap {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400, 500 };
        // arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 5;
        // arr[2] = 2;
        // arr[3] = 3;
        // arr[4] = 4;

        swap(arr, 1, 4);
        for (int var : arr) {

            System.out.println(var);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
