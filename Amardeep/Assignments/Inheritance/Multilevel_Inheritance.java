package Inheritance;

	
	class Grandparent{
		
		public void getName() {
			
			System.out.println("Grandparent getName method is called");
		}
		
		public void grandParentPhoneNum() {
			
			System.out.println("  Grandparent phoneNum method is called");
		}
	}
	
	
	class Parent extends Grandparent
	{
		
         public void getName() 
         {
			System.out.println("From parent class Parent getName overridden method is called");
		 }
		
		public void parentPhoneNum() 
		{
			System.out.println("from Parent class ParentphoneNum method is called");
		}
		
	}
	
	class Child extends Parent
	{
		public void getName() 
        {
			System.out.println("From child class child getName overridden method is called");
		 }
		
		public void parentPhoneNum() 
		{
			System.out.println("From child class parentphoneNum method is called");
		}
	}


