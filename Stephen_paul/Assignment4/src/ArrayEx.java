
public class ArrayEx {

	public static void main(String[] args) {
		
			int [] a = {12,13,15};
			int [] b = a;
			for(int index = 0; index < a.length; index++) {
				System.out.println("b" + b[index]);
			}
				
				a[0] = 10000;
				for(int index1 = 0; index1 < a.length; index1++) {
					System.out.println("a" + a[index1]);
				}
			}


	}


