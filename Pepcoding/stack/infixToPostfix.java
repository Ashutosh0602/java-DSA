import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String exp = "a*(b-c)/d+e";
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                ops.push(ch);

            } else if ((ch >= 0 && ch <= 9) || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();

                    String postV2 = post.pop();
                    String postV1 = post.pop();

                    String postv = postV1 + postV2 + op;
                    System.out.println(postv);
                    post.push(postv);

                    String preV2 = pre.pop();
                    String preV1 = pre.pop();

                    String prev = op + preV1 + preV2;
                    pre.push(prev);
                }
                ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    char op = ops.pop();

                    String postV2 = post.pop();
                    String postV1 = post.pop();

                    String postv = postV1 + postV2 + op;
                    post.push(postv);

                    String preV2 = pre.pop();
                    String preV1 = pre.pop();

                    String prev = op + preV1 + preV2;
                    pre.push(prev);
                }
                ops.push(ch);
            }
        }
        while (ops.size() > 0) {
            char op = ops.pop();

            String postV2 = post.pop();
            String postV1 = post.pop();

            String postv = postV1 + postV2 + op;
            post.push(postv);

            String preV2 = pre.pop();
            String preV1 = pre.pop();

            String prev = op + preV1 + preV2;
            pre.push(prev);
        }
        System.out.println(post.peek());
        System.out.println(pre.peek());
    }

    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
