//Write a Java program to sum the elements of an array

public class Sumelementsarray{
    public static void main(String[] args) {
        int sum=0,i;
        int[] Array = {1,2,3,4,5,6};
        for(i=0;i<Array.length;i++){
            sum=sum+Array[i];
        }
        System.out.println(sum);
    }

}
