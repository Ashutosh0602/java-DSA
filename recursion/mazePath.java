import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        System.out.println(getPath(0, 0, 3, 3));
    }

    public static ArrayList<String> getPath(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getPath(cr, cc + 1, er, ec);

        for (String rrhs : rrh) {
            mr.add("h" + rrhs);
        }

        ArrayList<String> rrv = getPath(cr + 1, cc, er, ec);

        for (String rrvs : rrv) {
            mr.add("v" + rrvs);
        }
        return mr;
    }
}
