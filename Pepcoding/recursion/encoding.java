public class encoding {
    public static void main(String[] args) {
        String str = "123";

    }
    
    public static String printEncodings(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String val=printEncodings(str.substring(i));
        }

        return "sd";
    }
}
