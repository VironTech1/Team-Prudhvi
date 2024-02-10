public class StudentMain {
    int studentid;
    String name;
    String email;
    long phone;
    String[] address = new String[4];

    public static void main(String[] args) {
        //int i = 10;
        //String str = "Hello";
        //int[] oneD = {1, 2, 3, 4, 5};
        //StudentMain stu = new StudentMain();  // Use StudentMain instead of Student

        StudentMain stu1 = new StudentMain();
        System.out.println("StudentId: " + stu1.studentid);
        System.out.println("Name: " + stu1.name);
        System.out.println("Email: " + stu1.email);
        System.out.println("Phone: " + stu1.phone);
        System.out.println("Address: " + stu1.address);

        StudentMain stu2 = new StudentMain();
        System.out.println("StudentId: " + stu2.studentid);
        System.out.println("Name: " + stu2.name);
        System.out.println("Email: " + stu2.email);
        System.out.println("Phone: " + stu2.phone);
        System.out.println("Address: " + stu2.address);

        stu1.studentid = 1101;
        stu2.name = "Java_Class";
        stu2.email = "stu1@gmail.com";
        stu2.phone = 1234567890;
        stu1.address[0] = "11000 Clear Stream Court";
        stu1.address[1] = "Louisville";
        stu1.address[2] = "Kentucky";

        System.out.println(stu1);
        System.out.println(stu2);

        StudentMain stu3 = stu1;  // Use StudentMain instead of Student
        stu2.studentid = 1103;
        System.out.println("StudentId: " + stu1.studentid);
        System.out.println("StudentId: " + stu3.studentid);
        for(int i=0;i<4;i++)
        {
        	System.out.println("The address is " + stu1.address[i]);
        }
    }
}
