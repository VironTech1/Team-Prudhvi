package learning.Day29;

public class CalculatorMain {
    public static void main(String[] args) {
        Maths m=new Add();
        m.perform(20,10);

        m=new Sub();
        m.perform(30,10);

        Calculator c=new Calculator();
        Maths m1=new Add();
        c.calculate(m1);

    }

}
