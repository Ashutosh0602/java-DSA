import java.util.ArrayList;
import java.util.Scanner;

public class stairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> ls = getStairPaths(scn.nextInt());
        System.out.println(ls);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : path1) {
            paths.add(1 + path);
        }
        for (String path : path2) {
            paths.add(2 + path);
        }
        for (String path : path3) {
            paths.add(3 + path);
        }

        return paths;
    }
}
