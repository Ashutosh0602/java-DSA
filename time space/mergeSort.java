public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 40, 60, 45, 32 };

        int[] res = sort(arr, 0, arr.length - 1);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] twosort(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;
            } else {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }

        if (i == arr1.length) {
            while (j < arr2.length) {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (j == arr2.length) {
            while (i < arr1.length) {
                merged[k] = arr1[i];
                i++;
                k++;
            }
        }
        return merged;
    }

    public static int[] sort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] bs = new int[1];
            bs[0] = arr[lo];
            return bs;
        }
        int mid = (lo + hi) / 2;

        int[] arr1 = sort(arr, lo, mid);
        int[] arr2 = sort(arr, mid + 1, hi);

        int[] merge = twosort(arr1, arr2);

        return merge;

    }
}
