import java.util.Scanner;

//1. Write a Java program to create an single dimension array and initialise the values?
//2. Write a Java program to print the values from an array?
public class SingleDimension {
    public static void main(String[] args) {
        int index=0;
        int[] Values={1,2,3,4,5,6,7,8,9,10} ;
        System.out.println("Enter the values below 10");
        Scanner Input=new Scanner(System.in);
        int X=Input.nextInt();
        for(int i=0; i<Values.length;i++){
            if(X==Values[i]){
                index=i;
                break;
            }

        }
        if(index!=-0){
            System.out.println(index);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
