import java.util.Scanner;
import java.util.Stack;

public class balanceBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == '(' || c == '{' || c == '[')) {
                // push the opening bracket onto the stack
                stack.push(c);
            } else if ((c == ')')) {
                if (stack.peek() == '(') {
                    stack.pop();
                }
            } else if ((c == '}')) {
                if (stack.peek() == '{') {
                    stack.pop();
                }
            } else if ((c == ']')) {
                if (stack.peek() == '[') {
                    stack.pop();
                }
            }
        }
        System.out.println(stack.empty());
    }
}
