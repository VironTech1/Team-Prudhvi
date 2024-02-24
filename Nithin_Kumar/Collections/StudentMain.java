package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentMain {
	public static void main(String[]args) {
	LinkedList<Student> mylist = new LinkedList<>();
	mylist.add(new Student("S555301","Nithin",25,"6605281126"));
	mylist.add(new Student("S555302","Ritish",25,"6605281450"));
	for(Student student : mylist) {
		System.out.println(student);
	}
	}
	

}
