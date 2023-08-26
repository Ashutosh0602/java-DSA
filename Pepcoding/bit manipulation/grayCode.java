import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class grayCode {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        Collections.sort(ls);
        int val = myPow(2, 4);
        System.out.println(val);
    }

    public static int myPow(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int val = myPow(x, n - 1);
        return val * x;
    }

}
