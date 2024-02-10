package OOP;

public class Student {
    int studentId;
    String name;
    String email;
    Long phone;
    String address;

}

class StudentMain{
    public static void main(String[] args) {
        Student stu1 = new Student();

        stu1.studentId=1;
        stu1.name="Kohli";

        System.out.println(stu1.studentId);
        System.out.println(stu1.name);
        System.out.println(stu1.email);
        System.out.println(stu1.phone);
        System.out.println(stu1.address);
    }
}
