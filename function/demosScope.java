public class demosScope {
    public static void main(String[] args) {
        int one = 10;
        int two = 30;
        int res = DemoScopes(one, two);
        System.out.println(res);
    }

    public static int DemoScopes(int one, int another) {
        int sum = one + another;
        return sum;
    }
}
