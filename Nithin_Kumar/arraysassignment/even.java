package arraysassignment;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {2,4,5,8,11};
		for(int i =0;i<myarray.length;i++) {
			if(myarray[i]%2==0) {
				System.out.println(myarray[i]);
			}
		}
		for (int j =0;j<myarray.length;j++) {
			if(myarray[j]%2!=0) {
				System.out.println(myarray[j]);
			}
		}

	}

}
