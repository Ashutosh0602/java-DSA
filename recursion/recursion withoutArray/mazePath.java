public class mazePath {
    static int k = 0;

    public static void main(String[] args) {
        path(0, 0, 5, 5, "");
        System.out.println(k);

    }

    public static void path(int cc, int cr, int ec, int er, String str) {
        if (cc >= ec + 1 || cr >= ec + 1) {
            return;
        }
        if (cc == ec && cr == er) {
            k++;
            System.out.println(str);
            return;
        }
        path(cc + 1, cr, ec, er, str + "h");
        path(cc, cr + 1, ec, er, str + "v");
    }
}
