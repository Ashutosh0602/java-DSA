public class dt {
    public static void main(String[] args) {
        byte b = 127;
        b = (byte) 133;
        System.out.println(b);
        float a = 3.23f;
        double d = 23.73789;
        int c;
        c = (int) d;
        a = (float) d;
        System.out.println(c);

        char ch = 'a';
        ch = 6230;
        ch = (char) (ch + 23);

        System.out.println(ch);

        System.out.println(20 + 30 + "Hello" + 10 + 20);
        System.out.println(2 + ' ' + 5);
        System.out.println(2 + " " + 5);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}