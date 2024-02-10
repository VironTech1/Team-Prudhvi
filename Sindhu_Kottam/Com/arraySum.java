package Com;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[100];
		int sum=0;
		for (int i=1;i<a.length;i++)
		{
			a[i]=i;
			sum=sum+a[i];
			//System.out.print(a[i]);
		}
		System.out.println("sum  is "+sum);
		
	}

}
