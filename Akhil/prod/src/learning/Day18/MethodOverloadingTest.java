package learning.Day18;

public class MethodOverloadingTest {
    public static void callme(int  i){
        System.out.println("Primitive integer");
    }



    public static void callme(Integer i){
        System.out.println("Primitive integer object");
    }


    public static void callme(double i){
        System.out.println("Primitive double");
    }

    public static void main(String[] args) {
        callme(10);
    }
}
