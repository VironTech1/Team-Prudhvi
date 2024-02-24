package Collections;

public class Student {
	String studentID;
	String name;
	int age;
	String phone;
	public Student(String studentID, String name, int age, String phone) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", Age: " + age + ", Phone: " + phone;
    }

	

}
