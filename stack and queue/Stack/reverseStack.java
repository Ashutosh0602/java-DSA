package Stack;

public class reverseStack {
    public static void main(String[] args) throws Exception {
        stackUsingArray stack = new stackUsingArray(5);
        for (int i = 0; i < 5; i++) {
            stack.push(i * 10);
        }
        stack.display();

        stackUsingArray helper = new stackUsingArray(5);
        reverseStack(stack, helper, 0);
        stack.display();
    }

    public static void reverseStack(stackUsingArray stack, stackUsingArray helper, int index) throws Exception {
        int item = stack.pop();
        reverseStack(stack, helper, index + 1);
        helper.push(item);
        if (index == 0) {
            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }

    }
}
