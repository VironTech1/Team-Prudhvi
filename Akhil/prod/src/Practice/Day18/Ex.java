package Practice.Day18;
import java.util.*;

public class Ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String is immutable in java
        /*String s="hello";
        s.concat("world");
        System.out.println(s);
        */
        /*

        //14. Write a program to calculate Currency for diiferent countries.

        //lets say 1 indian rupee =80 dolars
                                  //=75 euros
                                 //=99 pounds
        System.out.print("enter the value of rupee : ");
        int rupees= sc.nextInt();

        int dollar=rupees*80;

        System.out.println(":the value of dollars is : "+dollar);
        int euros=rupees*75;
        System.out.println("the value of euros is : "+euros);
        int pounds=rupees*99;
        System.out.println("the value of pounds is : "+pounds);

         */



        //25. Wrtie a program to calculate Gold rate(rate for grm 5250, 10 grms=1 tula) in cluding stones(each stone rate: 1500).
        // Calute the price by mix of gold and stones and making charges will be 10 ,18
        /*
        System.out.print("enter the weight of gold : ");

        int goldweight=sc.nextInt();

        System.out.println("do you need the stone?\n if you do then press '1' or press '0' ");

        int option= sc.nextInt();


        if(option ==1) {

            System.out.println("how many stones do you need : ");


            int quantity = sc.nextInt();

            double goldrate=(goldweight*5250) + (quantity*1500)+10+18;

            System.out.println("the total price of gold and "+quantity+" stones is : "+goldrate);

            ;
        }
        else{
            double goldrate=(goldweight*5250)+10;
            System.out.println("the total price of gold and "+option+" zero stones is "+goldrate);
        }

         */




        /*
        //17. Write a program to calculate dicount of given price?
        System.out.print("enter the amount : ");

        int price=sc.nextInt();

        System.out.print("enter the discount : ");

        int discount=sc.nextInt();

        double disamount=((price*discount)/100);

        double netprice=(price-(price*discount/100));

        System.out.println("the net price after discount : "+netprice);

         */
        /*
        //code for binary format
        int binary=sc.nextInt();
        String bins="";

        while(binary!=0){
            int binr=binary%2;
            bins=bins+binr;
            binary=binary/2;


        }
        System.out.println(bins);

         */

        /*
        int counter1=0;
        for(int j=1;j<=100;j++) {
            counter1=0;

            for (int i = 2; i <=100; i++) {
                if (j % i == 0) {
                    counter1++;
                }
            }

            if(counter1<2){
                System.out.println("the given number "+j+"  is prime number");
            }

        }

         */



        /*int counter1 = 0;
        System.out.println("printying the prime numbers from 1 to 100");
        for (int j = 2; j <= 100; j++) {
            counter1=0;

            for (int i = 2; i <= 100; i++) {
                if (j % i == 0) {
                    counter1++;
                }

            }
            if (counter1 == 1) {
                System.out.println(j);
            }

         */


        /*System.out.println("enter the value of the number to check for prime number");
        int prime=sc.nextInt();
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

         */
        /*
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

         */





        /*Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        //6.Java Program to factorial of a given number.
        //lets say the given number is 5
        /*int n=5;
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*(i);

        }
        System.out.println("the factorial of n is : "+f);*/
         /*
        System.out.println("printing the  mathematical tables of 10 numbers ");

        for(int i=1;i<11;i++) {
            for (int j = 1; j < 11; j++) {

                System.out.println(i + "X" + j + "=" + (i * j));
            }
            System.out.println("printed the table of " + i);
        }*/

        /*int rnum=0;
        while(num!=0){
            int unit=num%10;
            rnum=rnum*10+unit;
            num=num/10;


        }
        System.out.println("the reverse of the number is : "+rnum);*/
    }


}