package learning.Day18;

public class WrapperClassesEx {
    public static void main(String[] args) {
        boolean b=true;
        Boolean b1=true;
        char c='a';
        Character c1='a';
        //before java 1.5
        int i=10;
        Integer i1=new Integer(i);
        System.out.println(i);
        System.out.println(i1);
        int i2=i1.intValue();
        //int i2=i1;//what is the difference between these two
        System.out.println(i2+10);
        //since java1.5
        int i3=20;
        Integer i4=i3;
        Integer i5=100;//autoboxing
        int i6=i5;//auto un boxing
        String str=Integer.toString(1000);
        System.out.println(str);
        System.out.println(str+11);

        //Object obj=new Object();
        //obj=i2.
        int x=Integer.parseInt(str);
        System.out.println(x+10);

        Integer x1=Integer.parseInt(str);//now this is a object //we are storeing a int value in an object
        System.out.println(x1.intValue()+10);//the values for these too will be the same
        System.out.println(x1+10);//generally we cant perform addition on objects but here java does downcastig itself and makes it possible


    }
}
