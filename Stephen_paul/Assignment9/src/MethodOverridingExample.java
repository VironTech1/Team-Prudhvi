public class MethodOverridingExample {

    static class Animal {
        void run() {
            System.out.println("Runs with legs");
        }

        void eat() {
            System.out.println("Eat meal");
        }
    }

    static class Goat extends Animal {
        void may() {
            System.out.println("Goat may");
        }

        @Override
        void eat() {
            System.out.println("Goat eats");
        }
    }

    public static void main(String[] args) {
        Goat myGoat = new Goat();

        // Calling overridden methods
        myGoat.run();   // Output: Runs with legs
        myGoat.eat();   // Output: Goat eats
        myGoat.may();   // Output: Goat may
    }
}



