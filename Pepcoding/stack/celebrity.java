import java.util.Scanner;
import java.util.Stack;

public class celebrity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        problem(arr);
        // System.out.println(n);

    }

    public static void problem(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }

        while (stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();

            // If i knows j
            if (arr[i][j] == 1) {
                stack.push(j);
            } else {
                stack.push(j);
            }
        }

        int pot = stack.pop();

        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    System.out.println("NONE");
                    return;
                }
            }
        }

        System.out.println(pot);

    }
}
