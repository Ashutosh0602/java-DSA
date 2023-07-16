public class normalStack {
    public static void main(String[] args) {

    }

    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            // write ur code here
            return tos + 1;
        }

        void display() {
            // write ur code here
            for (int i = 0; i <= tos; ++i) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val) {
            // write ur code here
            if (tos == data.length) {
                System.out.println("stack overflow");
            } else {
                tos++;
                data[tos] = val;
            }
        }

        int pop() {
            // write ur code here
            if (tos == -1) {
                System.out.println("Stack Overflow");
                return -1;
            } else {
                int val = data[tos];
                tos--;
                return val;
            }
        }

        int top() {
            // write ur code here
            if (tos == -1) {
                System.out.println("Stack Overflow");
                return -1;
            } else {
                return data[tos];
            }
        }
    }
}
