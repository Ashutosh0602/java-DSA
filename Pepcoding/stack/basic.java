import java.util.Stack;

/**
 * basic
 */
public class basic {

    public static void main(String[] args) throws Exception {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println("stack is empty: " + st.isEmpty());
    }
}