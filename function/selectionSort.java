import org.w3c.dom.css.Counter;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 45, 8, 34, 78, 46 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
