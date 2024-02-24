package collections;

public class GenEx {
	import java.util.ArrayList;
	import java.util.Iterator;
	public class GenEx {

		public static void main(String[] args) {
			ArrayList <Integer> a1= new ArrayList<>();//new LinkedList();
			a1.add(100);
			a1.add(200);
		    a1.add(500);
		  //  a1.add(new Student(100,"stu0",20));
		    a1.add(400);
		   // a1.add("Hello");
		    System.out.println(a1);
		    Iterator<Integer> it =a1.iterator();
		    while(it.hasNext());{
		    	Integer i = it.next();
		    	System.out.println(i);
		    	}
		    System.out.println("*************");
		    for(Integer i : a1){
			System.out.println(i);
		    }
		
		    
		}
		}


}
