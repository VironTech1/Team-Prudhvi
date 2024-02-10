class Creature {
    public void run() {
        System.out.println("Runs with legs:");
    }

    public void eat() {
        System.out.println("Eats meat");
    }
}

class Cat extends Creature {
    public void meows() {
        System.out.println("Cat meows:");
    }

    public void eat() {
        System.out.println("Cat eats rats");//overriding
    }
}

class Dog extends Creature {
    public void bark() {
        System.out.println("Dog barks:");
    }
}

class Goat extends Creature {
    public void may() {
        System.out.println("Goat Mays:");
    }

    public void eat() {
        System.out.println("Goat eats leaves");//overriding
    }
}

public class ThreeLevelsofInheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meows();
        myCat.eat();

        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();

        Goat myGoat = new Goat();
        myGoat.may();
        myGoat.eat();
    }
}



