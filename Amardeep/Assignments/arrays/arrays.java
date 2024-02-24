package arrays;

public class arrays {
	
		 public static void main (String[] args) {
				
			//CREATION AND INITIALIZATION OF ARRAY 
				
			 int i;
			 
				int[] arr =new int[] {1,3,4,7,8,};
				
				System.out.println("arrray ar  is created and intialised");
				
			// PRINTING AN ARRAY ELEMEMTS 
				
				for (i = 0; i < arr.length; i++)
				{
				
				System.out.println("elements in array are :" + arr[i] );
				
				}
				
			//SEARCHING OF AN ELEMENT IN GIVEN ARRAY AND PRINTING ITS INDEX 
				
				int a = 7;
				
				for (i=0;i<arr.length;i++)
				{
					if(arr[i]==a)
					{
					System.out.println("element"+a+"is found  at index"+i+"in array ar");
					
				    }
				   
			    }
				//sum of elements in array
				int sum=0;
				for(i=0 ; i<arr.length; i++)
					
				{
					sum=sum+arr[i];
				}
				System.out.println("sum of array eleemts in array ar is:"+sum);
				
				//EVEN NUMBERS IN ARRAY
				
				System.out.println("even numbers in array are:");

				for(i=0;i<arr.length;i++)
				{
					if(arr[i]%2==0)
					{
						System.out.println(arr[i]);
					}
				}
				
				System.out.println("odd numbers in array are:");

				for(i=0;i<arr.length;i++)
				{
					if(arr[i]%2 !=0)
					{
						System.out.println(arr[i]);
					}
				}
				
				System.out.println("max and min number in array are:");

				int min=arr[0];
				int max=arr[0];
				for(i=0;i<arr.length;i++)
				{
				if(arr[i]<min)
				{
					min= arr[i];
				}
				if(arr[i]>max)
				{
					max =arr[i];
				}
					
					
				}
				System.out.println("Minimum element in array arr is:"+min);
				System.out.println("Maximum element in array arr is:"+max);
				
				
				//copy elements from one array to other
				
				int []b=new int[10];
				
                for(i=0 ; i<arr.length; i++)
					
				{
					b[i]=arr[i];
				
				}
                System.out.println("elememts in array b are :");
                for(i=0 ; i<b.length; i++)
					
				{
    				System.out.println(b[i]);

				}
                
                //duplicate elements in array arr
				
				System.out.println("Duplicate elememts in array arr are:");
				
                for(i=0 ; i<arr.length; i++)
					
				{
                	for (int j=i+1;j<arr.length;j++)
                	{
                		if(arr[i]==arr[j])
                		{
                			System.out.println(arr[i]);
;
                			
                		}
                		
                		
                	}
				
				}
				
				
                 //swap the array numbers in two indices
                
                
                int ind1=3;
                int ind2=1;
                
                int temp=arr[ind1];
                arr[ind1]=arr[ind2];
                 arr[ind2]=temp;
                 
                 for(i=0 ; i<arr.length; i++)
                 {
                	 System.out.println(arr[i]);
                 }

                 
                 
                 
     
                
                
            
				

				
		}
		}





