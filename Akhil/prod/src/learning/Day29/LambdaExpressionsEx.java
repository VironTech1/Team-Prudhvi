package learning.Day29;

public class LambdaExpressionsEx {//in this case we have done the whole program in one single file
    //in lambda expressions we give code as data for a variable
    //we store code in a variable
    public static void main(String... args) {
        Maths mAnno=new Maths() {//this is a anonymous class a class with no name
            //the class is declared and instantiated at the same time
            //we use this if we need to use a local class only once
            @Override
            public void perform(int i, int j) {
                System.out.println("in ANONYMOUS CLASS "+(i*j));
            }
        };
        mAnno.perform(10,20);
        Maths LambdaAdd=(int i, int j)-> {//here we didn't create any classes we just used the code stored in the variable
            System.out.println("Add "+(i+j));
        };
        LambdaAdd.perform(10,20);
        Maths LambdaSub=( i, j) ->{
            System.out.println("Sub "+(i-j));
        };
        LambdaSub.perform(10,20);
    }
}
