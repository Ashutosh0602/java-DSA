/**
 * basic
 */
public class basic {
    public static class Person {
        int age;
        String name;

        void sayHi() {
            System.out.println(name + "[" + age + "] says Hi!");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Ashutosh";
        p1.sayHi();

        Person p2 = new Person();
        p2.age = 35;
        p2.name = "John Doe";
        p2.sayHi();
    }
}