public class personClient {
    public static void main(String[] args) {
        person p1 = new person();

        // Next line is showing constructor
        person p2 = new person(34);

        // System.out.println(p1.name);
        // p2.age = 10;
        // p2.name = "Ashutosh";
        // System.out.println(p2.name);

        System.out.println(p1.getName());
        p1.setName("Ashutosh");

        System.out.println(p1.getName());

        System.out.println(p2.getAge());
    }
}