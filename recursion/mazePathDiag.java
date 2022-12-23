import java.util.ArrayList;

public class mazePathDiag {
    public static void main(String[] args) {
        System.out.println(getPath(0, 0, 2, 2));
    }

    public static ArrayList<String> getPath(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
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

        ArrayList<String> rrd = getPath(cr + 1, cc + 1, er, ec);
        for (String rrds : rrd) {
            mr.add("d" + rrds);
        }

        return mr;
    }
}
