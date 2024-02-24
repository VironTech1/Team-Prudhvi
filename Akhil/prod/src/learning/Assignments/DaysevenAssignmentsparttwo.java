//day 7 assignment part 2 (15questions)
package learning.Assignments;

import java.util.Scanner;
public class DaysevenAssignmentsparttwo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the number to be reversed and check for palindrop : ");

        int num=sc.nextInt();


        int numd=num;

        //1. Java Program to print  the first 10Natural Numbers.

        System.out.println("printing the first 10 natural numbers");
        int sum=0;
        int mul=1;

        for(int i=1;i<=10;i++){
            System.out.println(i);
            sum=sum+i;
            mul=mul*i;

        }
        //2.Java Program to Calculate the Sum of first 10 Natural Numbers
        System.out.println("the num of the first 10 natural numbers is : "+ sum);
        //3. Java Program to Calculate the multiplication of first 10 Natural Numbers
        System.out.println("the multiplication of first 10 natural numbers is : "+mul);
        //4. Java Program to print 5 mathematical table
        //5. Java Program to print 1-10 mathematical tables

        System.out.println("printing the  mathematical tables of 10 numbers ");

        for(int i=1;i<11;i++){
            for(int j=1;j<11;j++){

                System.out.println(i+"X"+j+"="+(i*j));
            }
            System.out.println("printed the table of "+i);

        }
        //6.Java Program to factorial of a given number.
        //lets say the given number is 5
        int n=5;
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*(i);

        }
        System.out.println("the factorial of n is : "+f);

        //q4,5(mathrematical tablre of firsrt 10 natural nukbrers)


        System.out.println("printing the  mathematical tables of 10 numbers ");

        for(int i=1;i<11;i++) {
            for (int j = 1; j < 11; j++) {

                System.out.println(i + "X" + j + "=" + (i * j));
            }
            System.out.println("printed the table of " + i);
        }
        //7. Java Program to print reverse of a given number
        int rnum=0;
        while(num!=0){
            int unit=num%10;
            rnum=rnum*10+unit;
            num=num/10;


        }
        System.out.println("the reverse of the number is : "+rnum);

        //8. Java Program to given number is palindrome or not

        if(numd==rnum){
            System.out.println("the given number is palindrome ");
        }
        else{
            System.out.println("not a palindrome");
        }





        //9. Java Program to find prime number or not.
        int prime=sc.nextInt();
        System.out.println("enter the value of number to check whether it is prime number or not");
        int counter=0;
        for(int i=2;i<100;i++){
            if(prime%i==0){
                counter++;
            }
        }
        if(counter>1){
            System.out.println("the given number "+prime+" is not prime number");
        }
        else if(counter==1){
            System.out.println("the given number "+prime+" is prime number");
        }

        //10. Java Program to print prime numbers between 1-100
        int counter1=0;
        for(int j=1;j<=100;j++) {
            counter1=0;

            for (int i = 1; i <=100; i++) {
                if (j % i == 0) {
                    counter1++;
                }
            }
            if(counter1>2){
                System.out.println("the given number "+j+"  is not prime number");
            }
            else if(counter1<2){
                System.out.println("the given number "+j+"  is prime number");
            }

        }


        //11. Java Program to find armstrong number

        int arms=sc.nextInt();
        int sumarm=0;
        int armsd=arms;
        int armsd1=arms;
        int counterarm=0;
        while(arms!=0){
            int r=(arms%10);

            counterarm++;
            arms=arms/10;

        }
        int narm=counterarm;

        while(armsd!=0){
            int ra=(armsd%10);
            sumarm= (int) (sumarm+Math.pow(ra,narm));
            armsd=armsd/10;
        }
        if(sumarm==armsd1){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("not armstrong");
        }


       /* while(arms!=0){
           int t=arms%10;
        }

        */


        //12. Java Program to print Fibonacci series//0,1,1,2,3,5,8
        System.out.println("enter the value for fibbanoci series : ");
        int fibb=sc.nextInt();
        int [] fibbo= new int[fibb];
        fibbo[0]=0;
        fibbo[1]=1;

        for(int i=2;i<fibb;i++){
            fibbo[i]=fibbo[i-2]+fibbo[i-1];

        }
        System.out.println("the fibbonaci series for the value entered "+fibb+" is ");
        for(int i=0;i<fibb;i++){
            System.out.print(fibbo[i]);
        }



        //13. Write a program to print below pattern
        //1
        //12
        //123
        //1234
        //12345
        System.out.println("printing the pattern given in the question");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        //14. Print the "*" in above pattern

        System.out.println("printing the pattern given in the question");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }





        //15.write a program to find binary format of a given number
        int binary=sc.nextInt();
        String bins="";

        while(binary!=0){
            int binr=binary%10;
            bins=bins+binr;
            binary=binary/10;


        }
        System.out.println(bins);





    }
}
