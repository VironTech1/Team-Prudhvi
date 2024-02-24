package abstractclassconcept;

public class Tvmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lg l=new Lg();
		System.out.println("using Lg object ");
		l.display();
		l.volInc(5);
		l.volDec(8);
		
		Samsung s=new Samsung();
		System.out.println("Using Samsung object ");
		s.display();
		s.volDec(5);
		s.volInc(2);
	}

}
