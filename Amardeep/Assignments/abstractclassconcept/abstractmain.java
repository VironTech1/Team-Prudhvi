package abstractclassconcept;

public class abstractmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     Bmw b=new Bmw();
     System.out.println("By using bmw object calling all the methods");
     b.accelerator(40);
     b.applyBreak(20);
     b.display();
     
     Audi a = new Audi();
     System.out.println("By using audi object calling all the methods");
     a.accelerator(25);
     a.applyBreak(8);
     a.display();
     
     
	}

}
