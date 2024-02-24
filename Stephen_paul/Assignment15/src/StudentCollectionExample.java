import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StudentCollectionExample {

	public static void main(String[] args) {
		        // Create a collection to store students
		        List<Student> students = new ArrayList<>();

		        // Add 5-10 student objects to the collection
		        students.add(new Student(1, "Alice", 20, "1234567890"));
		        students.add(new Student(2, "Bob", 21, "9876543210"));
		        students.add(new Student(3, "Charlie", 22, "2345678901"));
		        students.add(new Student(4, "David", 23, "8901234567"));
		        students.add(new Student(5, "Eve", 24, "4567890123"));

		        // Search for a student by ID
		        int searchId = 3;
		        Student foundStudent = null;
		        for (Student student : students) {
		            if (student.getStudentId() == searchId) {
		                foundStudent = student;
		                break;
		            }
		        }
		        if (foundStudent != null) {
		            System.out.println("Found student: " + foundStudent);
		        } else {
		            System.out.println("Student with ID " + searchId + " not found.");
		        }

		        // Delete a student by ID
		        int deleteId = 4;
		        boolean removed = students.removeIf(student -> student.getStudentId() == deleteId);
		        if (removed) {
		            System.out.println("Student with ID " + deleteId + " deleted successfully.");
		        } else {
		            System.out.println("Student with ID " + deleteId + " not found.");
		        }

		        // Update student name by ID
		        int updateId = 2;
		        String newName = "Bobby";
		        for (Student student : students) {
		            if (student.getStudentId() == updateId) {
		                student.setName(newName);
		                break;
		            }
		        }
		        System.out.println("Updated student: " + students.get(updateId - 1));
		    }

		    public static class Student {
		        private int studentId;
		        private String name;
		        private int age;
		        private String phone;

		        public Student(int studentId, String name, int age, String phone) {
		            this.studentId = studentId;
		            this.name = name;
		            this.age = age;
		            this.phone = phone;
		        }

		        public int getStudentId() {
		            return studentId;
		        }

		        public void setStudentId(int studentId) {
		            this.studentId = studentId;
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

		        @Override
		        public String toString() {
		            return "Student{" +
		                    "studentId=" + studentId +
		                    ", name='" + name + '\'' +
		                    ", age=" + age +
		                    ", phone='" + phone + '\'' +
		                    '}';
		        }
		    }
		}


