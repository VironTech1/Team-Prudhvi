//first list of assignments
//25 questions part 1
package learning.Firstassignment;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();

        //q 24 ( square of the given number)
        int sq = a*a;
        // q 23( if the number is multiple by 5 or not)
        if(a%5==0){
            System.out.println("a  is a multiple of 5");
        }
        else{
            System.out.println("a is not a multiple of 5");
        }
        //q22(odd or even)
        if(a%2==0){
            System.out.println("a is even  ");
        }
        else{
            System.out.println("a is odd");
        }

        System.out.println("square of a is : "+ sq);
        System.out.println("enter the value of b : ");
        int b= sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        //q6(avarge of three)
        int avg = ((a+b+c)/3);
        //q5(arae and perimeters od geometric figures)
         double pi = 3.14;
        double area = pi*(a*a);
        int d = a;
        a=b;
        b=d;
        System.out.println("the value of a after swaping :" + a);
        System.out.println("the value of b after swaping :"+ b);
        System.out.println("hello\n AKHIL REDDY");
        System.out.println("add"+(a+b));
        System.out.println("div"+(b/a));
        System.out.println("mul"+((a)*(b)));
        System.out.println("reminder when divided"+(b%a));
        System.out.println("area of circle:"+ area );
        System.out.println("arae of sqaure"+ (a*a));
        System.out.println("area of rectangle"+((a)*(b)));
        System.out.println("perimeter of circle"+(2*pi*a));
        System.out.println("perimeter of square"+(4*a));
        System.out.println("perimetre of rectangle"+(2*a*b));
        System.out.println("Average of three numbers : "+ avg);
        // maximum of three numbers and comparing two variables
        if(a>b&&a>c){
            System.out.println("'a' is the miximum of three");
        }
        else if(b>a&&b>c){
            System.out.println("'b' is the maximum of three");
        }
        else if(c>a&&c>b){
            System.out.println("'c' is the maximum of three");
        }

        //minimun of three numbers
        if(a<b&&a<c){
            System.out.println("'a' is the minium of three");
        }
        else if(b<a&&b<c) {
            System.out.println("'b is the minimum of three");
        }
        else if(c<a&&c<b){
            System.out.println("'c' is the minimum of three");
        }

        //17. Write a program to calculate dicount of given price?

        System.out.print("enter the amount : ");

        int price=sc.nextInt();

        System.out.print("enter the discount : ");

        int discount=sc.nextInt();

        double disamount=((price*discount)/100);

        double netprice=(price-(price*discount/100));

        //int netprice=(price-price*(discount/100));//when we do it like this we are getting the netprice as 100
        //why is that ?

        //25. Wrtie a program to calculate Gold rate(rate for grm 5250, 10 grms=1 tula) in cluding stones(each stone rate: 1500).
        // Calute the price by mix of gold and stones and making charges will be 10 ,18
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








    }

}
