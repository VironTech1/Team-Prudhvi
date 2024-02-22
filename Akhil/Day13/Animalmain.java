package learning.Day13;

public class Animalmain {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();

        dog d=new dog();
        a=d;
        a.eat();//dynamic method dispatch
        //a.bark();//it doesnt work because the superclass variable can access only the methods presents in superclass
        d.bark();
        dog d1=new dog();
        d1=(dog)a;
        goat g=new goat();
        g.may();
        a=g;
        a.eat();
        a.run();
        //cat c1=new cat();//throws error at the run time
       // c1=(cat)a;//as the object is not created at the complie time
        //c1.meow(); //the compiler doesn't see anything wrong with the syntax so it doesnt throw any error at the compile time



    }
}
