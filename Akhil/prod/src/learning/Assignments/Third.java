//first list of assignments
//25 questions part 3
package learning.Assignments;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        //10.Write a program to calculate EMI for given loan amount
        // (Ex: Amount : 1,00,000 Tenure : 5 yrs, intrerest : EmI for month :17,093 with 1 % interest  )
        //Formula for EMI Calculation is -
        //P x R x (1+R)^N / [(1+R)^N-1] where-
        //P = Principal loan amount.=100000
        //N = Loan tenure in months.=5X12=60
        //R = Monthly interest rate.=1
        //R = Annual Rate of interest/12/100
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of principle amount : ");
        int P= sc.nextInt();
        System.out.println("enter the value of laon tenture in months : ");
        int N= sc.nextInt();
        System.out.println("enter the value of interest rate : ");
        int R= sc.nextInt();





    }

}
