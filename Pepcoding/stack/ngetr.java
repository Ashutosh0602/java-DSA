import java.util.Scanner;
import java.util.Stack;

public class ngetr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        System.out.println(st);
        System.out.print("-1");
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && (arr[i] >= st.peek())) {
                st.pop();
            }
            if (st.isEmpty()) {
                System.out.printf(" %d", -1); // if stack is empty then print
            } else {
                System.out.printf(" %s", st.peek());// else top element of the stack
            }
            st.push(arr[i]);
        }
        // System.out.println(st);
    }
}
