public class global {
    public static int val = 20;

    public static void main(String[] args) {
        System.out.println(val);
        int val = 400;
        System.out.println(val);
        global.val += 342;
        System.out.println(global.val);
    }
}
