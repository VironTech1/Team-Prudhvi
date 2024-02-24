package learning.Day29;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Java7Features {
    public static void main(String[] args) {
        try(FileInputStream fi=new FileInputStream("viron.txt")){//feature # 2 try-with-resources
            int i=2/0;
            int[] a={2,3,4};
            System.out.println(a[6]);


        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | IOException Ai){//feature # 1 multiple exception handling
            System.out.println("exception caught");
        }
        //no need for final because of try-with-resources syntax
        int i=10000;//feature #3 (UnderScore in literals)
        int j=1_00_00;
        System.out.println("i "+i);
        System.out.println("j "+j);
        System.out.println(0b10);//feature #4 binary literals
        System.out.println(0B0);//
        ArrayList<Integer> al=new ArrayList<>();//feature #5 type inference
        //feature #6 diamond operator
        //both are the same thing before java1.7 we had to metion the data type on the right hand side too
        ArrayList<Integer> al1=new ArrayList<Integer>();//like this
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter the string : ");
        String STR=sc.nextLine();
        switch (STR){//before java1.7 strings were not allowed in switch //feature # 7 Strings in switch
            case "reddy":
                System.out.println("it is reddy");
                break;
            case "akhil":
                System.out.println("it is akhil");
                break;
            case "nagulapally":
                System.out.println("it is nagulapally");
                break;
            default:
                System.out.println("invalid input");
        }



    }
}
