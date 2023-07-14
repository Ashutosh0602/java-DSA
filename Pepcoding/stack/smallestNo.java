import java.util.Scanner;
import java.util.Stack;

public class smallestNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int j = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(j);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'd') {
                j++;
                stack.push(j);
            } else {
                j++;
                while (stack.size() > 0) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
                stack.push(j);
            }
        }
        while (stack.size() > 0) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
