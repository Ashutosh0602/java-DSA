import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            System.out.println(rem);
            temp = temp / 10;
        }
    }
}
