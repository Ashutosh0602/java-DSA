/**
 * classes
 */
public class classes {

    public static void main(String[] args) throws Exception {
        student s1 = new student("Ashutosh Rai", 2003);
        System.out.println(s1.YOB);
        System.out.println(s1.name);

        // s1.name = "Ashutosh Rai";
        System.out.println(s1.name);
        // s1.YOB = 2001;

        student s2 = new student("Aman Rai", 1999);
        // s2.name = "Aman Rai";
        System.out.println(s2.name);

        System.out.println(s1.check());

        student s3 = new student(s2.name, s2.YOB);
        System.out.println(s3.YOB);

    }
}