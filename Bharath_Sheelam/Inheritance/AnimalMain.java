package Inheritance;

public class AnimalMain {
    public static void main(String[] args) {
        /*Animal a = new Animal();
        a.eat();*/

        Cat c = new Cat();
        //a = c;
        //a.eat();
        c.meow();
        c.eat();

        Dog d = new Dog();
        //a=d;
        //a.eat();
        d.bark();
        d.eat();
    }
}
