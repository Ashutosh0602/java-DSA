package Stack;

public class dynamicStackClient {
    public static void main(String[] args) throws Exception {

        stackUsingArray stack = new dynamicStack(5);

        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
            stack.display();
        }
        stack.push(60);
        stack.push(70);
        // stack.display();
        while (!stack.isEmpty()) {
            stack.display();
            stack.pop();
        }
    }

}
