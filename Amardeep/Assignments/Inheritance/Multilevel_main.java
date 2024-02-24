package Inheritance;

public class Multilevel_main {

	public static void main(String[] args) {

		
		Grandparent gp=new Grandparent();
		
		System.out.println("GRANDPARENT DETAILS USING GRANDPARENT OBJECT");
		
		gp.getName();
		
		gp.grandParentPhoneNum();
		
		Parent p=new Parent();
		
		System.out.println("PARENT AND GRANDPARENT DETAILS USING PARENT OBJECT");
		
		p.getName();
		
		p.grandParentPhoneNum();
		
		p.parentPhoneNum();
		
		
		Child c=new Child();
		
		System.out.println("CHILD,PARENT AND GRANDPARENT DETAILS USING PARENT OBJECT");

		
		c.getName();
		
		c.grandParentPhoneNum();
		
		c.parentPhoneNum();
		
		
	}

}
