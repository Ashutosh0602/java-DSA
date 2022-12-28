public class permutation {
    public static void main(String[] args) {
        seq("abcd", "");
    }

    public static void seq(String ques, String ans) {
        if (ques.length() == 1) {
            System.out.println(ques + ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String nstr = ques.substring(0, i) + ques.substring(i + 1);
            seq(nstr, ans + ch);
        }
    }
}
