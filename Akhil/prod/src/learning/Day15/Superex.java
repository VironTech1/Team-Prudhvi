//day 15 in class
//super key ward (was told to practice)
package learning.Day15;

public class Superex {
    int number;
    String name;
    public Superex(){

        System.out.println("this a no argument constucter");
    }
    public void method1(){
        System.out.println("this is method1");
    }
   public int method2(){
        System.out.println("this is method 2");
        return 0;
    }
}

//Always Class name should be in PascalCase convention
class subex extends Superex{

    subex(){
        super();
        System.out.println("this is sub ex constructor");
    }
    void methodsub(){

        super.method1();
        super.method2();

        System.out.println("this ia a sub class method");
    }


}

