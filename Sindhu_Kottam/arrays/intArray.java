package arrays;

import java.util.Scanner;

public class intArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
    int[] ar=new int[10];
    int[] copy_ar=new int[10];
    int[] odd=new int[10];
    int[] even=new int[10];
    int j=0,k=0,max=ar[0];
    int min=ar[0];
    //Initializing the array
    for(int i=0;i<ar.length;i++)
    {
    	ar[i]=i+15;
    	System.out.print(" "+ar[i]);
    }
    //copying elements from one array to another
    for(int i=0;i<ar.length;i++)
    {
    	copy_ar[i]=ar[i];
    }
    System.out.println("");
    //searching for element at index
    System.out.println("Enter numbner to find in array");
    int n=s.nextInt();
    for(int i=0;i<ar.length;i++)
    {
    	if(ar[i]==n)
    	{
    		System.out.println("Element found at index "+i);
    		break;
    	}
    	else if(i==ar.length-1)
    	{
    		System.out.println("Element not found ");
    	}
    }
    min=ar[0];
    //finding min and max also assigning odd and even arrays
    for(int i=0;i<ar.length;i++)
    {
    	if(ar[i]>max)
    		max=ar[i];
    	else if(ar[i]<min)
    		min=ar[i];
    		
    	if(ar[i]%2==0)
    	{
    		even[j]=ar[i];
    		j++;
    	}
    	else 
    	{
    		odd[k]=ar[i];
    		k++;
    	}
    }
    //finding duplicate numbers
    ar[1]=15;
    
    for (int i=0;i<ar.length;i++)
    {
    	for(int z=i+1;z<ar.length;z++)
    	{
    		if(ar[i]==ar[z])
    		{
    			System.out.println("Duplicate spotted"+ar[i]);
    		}
    	}
    }
    
    
    System.out.println("Even numbers in array");
    for(int i=0;i<j;i++)
    {
    	System.out.print(" "+even[i]);
    	
    }
    System.out.println("");
    System.out.println("odd numbers in array");
    for(int i=0;i<k;i++)
    {
    	System.out.print(" "+odd[i]);
    	
    }
    System.out.println("");
    System.out.println("Minimum is "+min);
    System.out.println("Maximum is "+max);
    
    System.out.println("give indexes to swap");
    int a,b,temp;
    a=s.nextInt();
    b=s.nextInt();
    System.out.println("Before Swapping");
    for(int i=0;i<ar.length;i++)
    {
    	System.out.print(" "+ar[i]);
    }
    temp=ar[a];
    ar[a]=ar[b];
    ar[b]=temp;
    System.out.println("");
    System.out.println("After Swapping");
    for(int i=0;i<ar.length;i++)
    {
    	System.out.print(" "+ar[i]);
    }
	}

}
