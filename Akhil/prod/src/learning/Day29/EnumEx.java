package learning.Day29;

public class EnumEx {
    public static void main(String[] args) {
        //creating constants with final keyword
        /*
        final int Max_Mark=100;
        System.out.println("the max mark is "+Max_Mark);
        int temp=Max_Mark;
        System.out.println(temp);
        temp=200;
        System.out.println(temp);

         */
        //now in this case even though we declared Max_Mark as final we were able to

        //change the temp value which is indirectly the value of Max_Mark
        //and the second problem is we cannot print the name of the variable
        //it always prints the value but not the name of the constant variable
        //to overcome this issue for constants in java 5 they introduced 'enums'

        //System.out.println(Marks.Max_Mark);//prints 'Max_Mark' as string(the name of the constant variable)
        System.out.println(Marks.MAX_MARK+" "+Marks.MAX_MARK.getValue());//prints the value of constant variable


    }

}
enum Marks{
    //MAX_MARK;//this can be considered as a constant variable of data type Marks which is a enum
    //and also as an object of the class Marks which is an enum
    //MAX_MARK(100);//an object of class marks with an argument
    //all the variables in enum are 'static variables'
    MAX_MARK(100),MIN_MARK(35),AVG_MARK;
    Marks(){
        System.out.println("Marks Constructor");
    }
    int value;
    Marks(int value){//a constructor of class marks with an argument
        System.out.println("an argument constructor");
        this.value=value;
    }
    public int getValue(){
        return value;
    }

}
