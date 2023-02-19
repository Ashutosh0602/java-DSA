package Stack;

public class stackUsingArrayClient {
    public static void main(String[] args) throws Exception {

        stackUsingArray stack = new stackUsingArray(10);

        stack.push(10);
        stack.push(20);
        stack.display();
    }
}
