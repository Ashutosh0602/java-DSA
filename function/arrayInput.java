import java.util.Scanner;

public class arrayInput {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeinput();
        display(array);
    }

    public static int[] takeinput() {
        System.out.println("Size: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value of " + i + " index");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] array) {
        for (int val : array) {
            System.out.println(String.format("Value of a[%s]", val));
        }
    }

}
