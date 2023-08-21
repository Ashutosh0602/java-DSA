import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) throws Exception {
        String str = "abc";
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> ls1 = gss(str.substring(0, 1));
        ArrayList<String> ls2 = gss(str.substring(1, str.length()));
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < ls1.size(); i++) {
            String val = ls1.get(0) + ls2.get(i);
            ls.add(val);
        }
        return ls;
    }
}
