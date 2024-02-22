package classAssignment;

public class studentMain extends student {
	public static void main(String[]args) {
		student stu1 = new student();
		student stu2 = new student();
//		System.out.println("Student 1 details before assigning values");
		System.out.println("Student 1 details before assigning values\n" +stu1);
//		System.out.println(stu1.studentID);
//		System.out.println(stu1.name);
//		System.out.println(stu1.email);
//		System.out.println(stu1.phone);
//		System.out.println(stu1.address);
		
//		System.out.println("Student 2 details before assigning values");
		System.out.println("Student 2 details before assigning values \n" +stu2);
//		System.out.println(stu2.studentID);
//		System.out.println(stu2.name);
//		System.out.println(stu2.email);
//		System.out.println(stu2.phone);
//		System.out.println(stu2.address);
		
		stu1.studentID = 1001;
		stu1.name = "student1";
		stu1.email = "stu1@mail.com";
		stu1.phone = 1111111;
		stu1.line1 = "line1";
		stu1.line2 = "line2";
		stu1.area = "area";
		stu1.pincode = 11111;
		
		System.out.println("Student 1 details after assigning values\n" +stu1);
//		System.out.println("Student 1 details after assigning values");
//		System.out.println(stu1.studentID);
//		System.out.println(stu1.name);
//		System.out.println(stu1.email);
//		System.out.println(stu1.phone);
//		System.out.println(st.line1+","+add1.line2+","+add1.area+","+add1.pincode);
		

		stu2.studentID = 1002;
		stu2.name = "student2";
		stu2.email = "stu2@mail.com";
		stu2.phone = 222222;
		stu2.line1 = "line1";
		stu2.line2 = "line2";
		stu2.area = "area2";
		stu2.pincode = 22222;
		
		System.out.println("Student 2 details after assigning values\n" +stu2);
		
//		System.out.println("Student 2 details after assigning values");
//		System.out.println(stu2.studentID);
//		System.out.println(stu2.name);
//		System.out.println(stu2.email);
//		System.out.println(stu2.phone);
//		System.out.println(stu2.line1+","+stu2.line2+","+stu2.area+","+stu2.pincode);
		
//		System.out.println("Student 3 assigned to student 1 details");
		student stu3 = new student();
		stu3 = stu1;
		System.out.println("Student 3 assigned to student 1 details\n" + stu3);
		stu3.studentID = 1003;
		System.out.println("Student 3 assigned to student 1 details\n" + stu3);
	}

}
