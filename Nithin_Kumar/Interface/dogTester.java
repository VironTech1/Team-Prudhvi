package Interface;

import java.util.Scanner;

public class dogTester extends dogclass {
	public static void main(String[] args) {
		dogclass dog = new dogclass ();
		Scanner s = new Scanner (System.in);
		System.out.println("enter the name breed and age of the dog");
		String name = s.nextLine();
		String breed = s.nextLine();
		int age = s.nextInt();
		dog.setName(name);
		dog.setAge(age);
		dog.setBreed(breed);
		System.out.println(dog);
	}
	

}
