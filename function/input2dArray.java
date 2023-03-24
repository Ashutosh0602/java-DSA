import java.util.Scanner;

public class input2dArray {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        display(arr);
    }

    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int row = s.nextInt();
        int[][] arr = new int[row][];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter the no of colums:");
            int col = s.nextInt();
            arr[i] = new int[col];
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
