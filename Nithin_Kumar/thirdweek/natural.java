package thirdweek;

public class natural {
	public static void main(String[]args) {
		int i;
		for(i = 1; i<=10;i++) {
			System.out.println(i+ " ");
		}
		int sum=0;
		for(i=0;i<=10;i++) {
			sum = sum+i;
		}
		System.out.println("sum=" + sum);
		int multi=0;
		for(i=1;i<=10;i++) {
			multi = multi*i;
		}
		System.out.println("multiplication of first 10 natural numbers="+ multi);
		
	}

}
