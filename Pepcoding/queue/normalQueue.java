public class normalQueue {
    public static void main(String[] args) {

    }

    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            // write ur code here
            return size;
        }

        void display() {
            // write ur code here
            if (size == 0) {
                System.out.println("Queue underflow");
            } else {
                for (int i = front; i <= (size - 1); i++) {
                    System.out.print(data[i] + " ");
                }
            }
        }

        void add(int val) {
            // write ur code here
            if ((size > data.length)) {
                System.out.println("Queue overflow");
            } else {
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }
        }

        int remove() {
            // write ur code here
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                int item = data[front];
                front++;
                size--;
                return item;
            }
        }

        int peek() {
            // write ur code here
            if (size == 0) {
                return -1;
            } else {
                return data[front];
            }
        }
    }
}
