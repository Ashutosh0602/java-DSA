import java.util.ArrayList;
import java.util.Scanner;

public class Kpc {
    public static void main(String[] args) throws Exception {
        // Scanner scn = new Scanner(System.in);
        // String str = scn.next();
        ArrayList<String> words = getKPC("78");
        System.out.println(words);
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeForch = codes[ch - '0'];
        for (int i = 0; i < codeForch.length(); i++) {
            char chcode = codeForch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }
}
