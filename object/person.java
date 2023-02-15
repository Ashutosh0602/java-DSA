public class person {
    private String name;
    private int age;

    public person() {
        System.out.println("I am default constructor");
    }

    public person(int age) {
        System.out.println("I am paramterized constructor " + age);
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Nname) {
        this.name = Nname;
    }

    public int getAge() {
        return this.age;
    }
}
