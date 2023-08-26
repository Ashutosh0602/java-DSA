public class pair {
    int a;
    int b;

    pair(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    void func1() {
        System.out.println("this is function func1");
        this.func2();
    }

    void func2() {
        System.out.println("This is function func2");
    }
}
