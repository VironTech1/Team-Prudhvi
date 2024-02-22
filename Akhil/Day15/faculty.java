//day 15 in class
//this
package learning.Day15;

public class faculty {
    int faceid;
    String name;
    double salary;

    void info(){
        System.out.println("this is a method info");
    }
    void info2(){
        this.info();//this will call info();//  always this and super should be first statement.
        //So you cannot use both this and super at the same time.
        System.out.println("insode method info2");
    }
    public faculty(){
        //this(123,"akhil",10000);//this leads to recurssion

        System.out.println("this is a no argument constructor");



    }
    public faculty(int faced,String name,double salary){

        /*
        //faceid=faceid;//this will assign the value of 123 to 123
        //123=123;//this is what the JVM(java virtual mechine does )
        //because the identifier names and the names in the construtor are same
        //generally we do not give the same names // but even if we do is we want that to be execute properly than
        // this is where the 'this' key word comes in picture

        name=name;
        salary=salary;

         */

        this();//it calls the no arguments constructor
        faceid=faced;//here 'this' represents the object that we called in this case it is 'obj.faceid=faceid'
        this.name=name;
        this.salary=salary;
    }

    public static void main(String[] args) {

        faculty obj=new faculty(123,"gopi",10000);

        obj.info2();//calling info2() which in turn calls info().
        System.out.println(obj.faceid+" "+obj.name+" "+obj.salary);//this will give the output as
        //0 null 0.0 //because in the constructor faculty(s,r,t)(look in the constructor)

    }
}
