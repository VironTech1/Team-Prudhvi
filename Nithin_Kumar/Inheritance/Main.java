package Inheritance;

public class Main {
	Animal a; 
	static Goat g = new Goat();
	static Cat c = new Cat();
	Dog d = new Dog();
	public static void main(String[] args) {
		 Animal a1 = new Goat();
		 
		 System.out.println(a1.eat());
		 a1 = new Cat();
		 a1=c;
		 System.out.println(a1.eat());
		 a1 = g;
		 System.out.println(a1.eat());

		 
	}
	

}
