
public class MainClass {

	public static void main(String[] args) {
		int i =10;
		int j= 5;
		System.out.println("Add:" + (i+j));
		MainClass mainInstance = new MainClass();
		Subclass s = mainInstance.new Subclass();
		s.SubstractandPrint();
	}
 class Subclass
 {
	 int i = 10;
	 int j = 5;
	
	 public void SubstractandPrint()
	 {
		 System.out.println("Substract:" + (i-j));
	 }

 }	
 
}

