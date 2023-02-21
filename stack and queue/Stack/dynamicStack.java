package Stack;

public class dynamicStack extends stackUsingArray {
    public dynamicStack() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public dynamicStack(int capacity) throws Exception {
        super(capacity);
    }

    public void push(int item) throws Exception {
        if (this.size() == this.data.length) {
            int[] arr = new int[2 * this.data.length];
            for (int i = 0; i < this.size(); i++) {
                arr[i] = this.data[i];
            }
            this.data = arr;
        }
        super.push(item);
    }
}
