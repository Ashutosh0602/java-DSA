import java.util.Stack;

public class postfixEval {
    public static void main(String[] args) {
        String str = "264*8/+3-";
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int num1 = Integer.parseInt(stack.pop() + "");
                int num2 = Integer.parseInt(stack.pop() + "");
                int eval = evaluate(num2, num1, ch);

                stack.push(eval);

            } else if (ch >= '0' || ch <= '9') {

                stack.push(Integer.parseInt(ch + ""));
            }
        }
        System.out.println(stack.peek());
    }

    public static int evaluate(int n1, int n2, char ch) {
        if (ch == '*') {
            return n1 * n2;
        } else if (ch == '+') {
            return n1 + n2;
        } else if (ch == '-') {
            return n1 - n2;
        } else {
            return n1 / n2;
        }
    }

}
