public class strings {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println(str.substring(0, 4));

        String str1 = " World";
        System.out.println(str.concat(str1));
        System.out.println(str1.indexOf("or"));

        System.out.println(str.startsWith("H")); // this function is case sensitive

        String str2 = "hello World";
        System.out.println(str == str2); // it compares the two string and is case sensitive
        System.out.println(str.equals(str2));

    }
}
