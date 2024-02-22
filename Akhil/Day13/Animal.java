package learning.Day13;

public  class Animal {
    String name;
     void run(){
         System.out.println("it runs on four legs");
     }
     void eat(){
         System.out.println("it eats meat");
     }



}
class cat extends Animal{

    void meow(){
        System.out.println("the cat meows");
    }

    void eat(){
        System.out.println("it drinks milk most of the time \n and eats meat whenever it finds it \n but it doesn't find it that easily though poor cat");
    }


}
class dog extends Animal{
    void bark(){
        System.out.println(" the dog barks");
    }

}
class goat extends Animal{
    void may(){
        System.out.println("the goat mays");
    }
    void eat(){
        System.out.println("i do not eat meat i eat grass");
    }
}


