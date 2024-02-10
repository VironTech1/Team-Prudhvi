package arrays;

	
	class Student1{
		int studentid;
		String studentName;
		int age;
		String gender;	
		String address[]=new String[3];
		
	}


	public class Student {

		public static void main(String[] args) {

			Student1 s1=new Student1();
			
			s1.studentid=101;
			s1.studentName="Amardeep Jetty";
			s1.age=23;
			s1.gender="M";
			s1.address[0]="Subash Nagar";
			s1.address[1]="Metpally";
			s1.address[2]="505325";
			
			
			System.out.println("Id :"+s1.studentid);
			System.out.println("Name :"+s1.studentName);
			System.out.println("Age :"+s1.age);
			System.out.println("Gender :"+s1.gender);
			System.out.println("Address Information :");
			
			for(int s=0;s<s1.address.length;s++) {
				
				System.out.println(s1.address[s]);
				
			}
			
		}

	}


