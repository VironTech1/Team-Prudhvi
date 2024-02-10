package Com;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30,40};
		int[]b=a;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]);
		}
		System.out.println("");
		
		a[0]=100;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]);
		}
	}

}
