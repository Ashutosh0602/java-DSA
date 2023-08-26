public class test {
    public static void main(String[] args) {
        B obj = new B();
        obj.check();

        student sd = new student();
        sd.name = "Ashutosh";
        sd.schoolName = "STPSSS";
        System.out.println(sd.schoolName);
        System.out.println(sd.name);

        student sd2 = new student();
        System.out.println(sd2.schoolName);
        System.out.println(sd2.name);

    }
}
