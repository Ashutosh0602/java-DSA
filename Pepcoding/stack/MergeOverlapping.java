import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeOverlapping {
    public static void main(String[] args) {

    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair other) {
            if (this.st != other.st) {
                return this.st = other.st;
            } else {
                return this.et = other.et;
            }
        }
    }
}
