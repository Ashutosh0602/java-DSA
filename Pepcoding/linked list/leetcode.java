
public class leetcode {
    public static void main(String[] args) {
        int str = isIsomorphic("4193 with words");
        System.out.println("'" + str + "'");

    }

    public static int isIsomorphic(String s) {
        s = s.trim();
        String pos = "";
        for (int i = 0; i < s.length(); i++) {
            // char c =(s.charAt(i));
            if (Integer.parseInt(s.charAt(i) + "") % 1 == 0) {
                System.out.println(s.charAt(i));
                pos = pos + s.charAt(i) + "";
            }
        }
        return Integer.parseInt(pos);
    }

}
