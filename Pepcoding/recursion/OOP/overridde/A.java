/**
 * A
 */
public class A {
    int val;

    // @Override
    void check() {
        System.out.println("This is A class");
    }

    int compareTo(A obj) {
        return this.val - obj.val;
    }
}