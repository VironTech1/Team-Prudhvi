//day 11 practicing method overloading

package Practice;

public class Overloading {
    public static void main(String[] args) {
        Method M=new Method("day 11","Mehod overloading",1,11+"pm");
        //M.str="akhil";//it cahnes the string "day 11" to "AKHIL" without any error.
       // M.trs="reddy";//it throws an error saying //trs has private access in Practice.Method
        M.getdetails();

       int t= M.add(3,4);
       String d=M.add("Akhil",9);
       String db=M.add(2,"Akhil");

        System.out.println("the output is : "+t+" "+d+" "+db);


    }


}
