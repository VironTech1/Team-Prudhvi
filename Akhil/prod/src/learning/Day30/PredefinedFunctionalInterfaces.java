package learning.Day30;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {
    public static void main(String[] args) {
        //Supplier<Integer> sup1=()->{return 100;};//return statement should always be within the flower brackets
        //or we can also write it like

        Supplier<Integer> sup1=()->100;//doesn't take an  input but returns an output
        System.out.println(sup1.get());

        Supplier<String>sup2=()->"hello";
        System.out.println(sup2.get());

        //Supplier<Date>sup3=()->new Date();
        //doing this after the line 31
        Supplier<Date> sup3=Date::new;
        Date d=sup3.get();
        System.out.println(d);
        System.out.println(sup3.get());

        Consumer<String> cons1=(String name)-> System.out.println("hello "+name);
        //takes an input and it doesn't return anything
        cons1.accept("akhil");

        //Consumer<Integer> cons2=(Integer i)-> System.out.println(i);
        //cons2.accept(10);
        //we can write this syntax in different format like
        Consumer<Integer> cons2=System.out::println;//this is known as method reference(or)Constructor reference (or) Static method reference
        cons2.accept(100);
        //there are four rules to be followed while dealing with method reference
        //#1 it is only applicable in LAMBDA EXPRESSIONS
        //#2 it should have only one line of code
        //#3 that one line of code should invoke a method or a constructor
        //#4 the no of arguments in the method that is being invoked should be same as the no of arguments in the lambda expression
        Predicate<Integer> pre=(a)-> a/2==0;//takes an input and returns a boolean
        boolean b= pre.test(20);
        System.out.println(b);

        Function<String,Integer> fun=(str)->Integer.parseInt(str);//takes an input of one type and returns an output of another type
        //in datatype arrangement should be like Function<i/p data,o/p data> fun=(i/p data)->Integer.ParseInt(i/p data);
        System.out.println(fun.apply("10"));
        int f= fun.apply("10");
        System.out.println(f+10);








    }
}
