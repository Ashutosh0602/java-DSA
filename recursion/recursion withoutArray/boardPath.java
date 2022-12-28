public class boardPath {
    static int k = 0;

    public static void main(String[] args) {
        System.out.println("wrgw" + 2 + 2);
        path(0, 10, "");
        System.out.println(k);
    }

    public static void path(int cur, int end, String str) {
        if (cur == end) {
            k++;
            System.out.println(str);
            return;
        }
        if (cur > end) {
            return;
        }
        for (int i = 1; i <= 6; i++) {
            path(cur + i, end, str + i);
        }
    }
}
