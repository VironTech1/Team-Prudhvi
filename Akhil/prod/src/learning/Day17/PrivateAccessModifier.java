package learning.Day17;

public class PrivateAccessModifier {

    protected class Arun{

      protected void  method(){
          System.out.println("inside method Arun protected");
        }
    }
    class Arun2 extends Arun{

        public void method(){
            super.method();
            System.out.println("this is Arun2 subClass method");


        }
    }


     /*int i=  10;

     double j=10;

      void method1()
     {
         i=20;

     }*/
    public static void main(String[] args) {
        PrivateAccessModifier privateAccessModifier= new PrivateAccessModifier();
      //  privateAccessModifier.method1();
        //Arun2 arun2= new Arun2();

        //System.out.println(privateAccessModifier.i);



    }
}
