import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        ArrayList<String> ls = getMazePaths(0, 0, 2, 2);
        System.out.println(ls);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> str = new ArrayList<>();
            str.add("");
            return str;
        }
        ArrayList<String> hr = new ArrayList<>();
        ArrayList<String> vr = new ArrayList<>();

        if (sc < dc) {
            hr = getMazePaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vr = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> path = new ArrayList<>();
        for (String pt : hr) {
            path.add(pt + 'h');
        }
        for (String pt : vr) {
            path.add(pt + 'v');
        }

        return path;
    }

}
