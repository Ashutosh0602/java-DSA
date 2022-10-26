import java.util.Scanner;

public class input2d {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        System.out.println("Print out the no. of rows:");

        int rows = snc.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the no of columns:");
            int col = snc.nextInt();
            arr[i] = new int[col];
            for (int cols = 0; cols < col; cols++) {
                System.out.println("Enter the valur for row" + rows + " and for col" + cols);
                arr[i][cols] = snc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }

    }
}
