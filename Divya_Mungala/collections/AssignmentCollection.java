package collections;

public class AssignmentCollection {
	import java.util.HashSet;
	import java.util.ArrayList;
	import java.util.TreeSet;

	public class AssignmentCollection {
		
		public static void main(String[] args) {
			
			//ArrayList a1=new ArrayList();
			//HashSet a1=new HashSet();
			TreeSet a1=new TreeSet();
			 a1.add(100);
			 a1.add(200);
			 a1.add(300);
			 a1.add(500);
			//a1.add("Hello");
			 a1.add(100);
			 a1.add(200);
			 a1.add(300);
			 
			 System.out.println(a1);
			 a1.remove(100);
			 //a1.remove("Hello");
				System.out.println(a1);
		}

	
}
