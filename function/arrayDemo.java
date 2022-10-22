public class arrayDemo {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(arr);

        arr = new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 40;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[0] = 80;
        // another way writing array in loop
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
