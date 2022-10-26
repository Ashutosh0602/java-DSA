public class d2Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        int[] ns = { 1, 2, 3, 4, 5, 6 };
        int[] ns1 = { 7, 8, 9, 10, 11, 12 };
        // arr[0] = new int[1];
        // arr[1] = new int[2];
        arr[0] = ns;
        arr[1] = ns1;
        System.out.println(arr[1][4]);
    }
}
