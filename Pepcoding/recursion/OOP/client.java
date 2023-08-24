public class client {
    public static void main(String[] args) {
        dad d = new dad();
        System.out.println(d.dadMoney);
        d.dadProperty();

        child ch = new child();
        System.out.println(ch.childMoney + ch.dadMoney);
    }
}
