/**
 * subSequence
 */
public class subSequence {

    public static void main(String[] args) {
        // String str = "java";
        // char ch = str.charAt(0);
        // System.out.println(str + ch);
        seq("abc", "");
    }

    public static void seq(String org, String result) {
        if (org.length() == 0) {
            System.out.println(result);
            return;
        }
        char chr = org.charAt(0);
        String str = org.substring(1);
        seq(str, result);
        seq(str, result + chr);
        // return str;
    }
}