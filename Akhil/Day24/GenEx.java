package learning.Day24;

import learning.Day18.Student;
import learning.Day18.Address;

import java.util.ArrayList;
import java.util.Iterator;

public class GenEx {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        //ArrayList al=new ArrayList();
        Address a=new Address("8-12","gandhi bus stop","Armoor","Telangana","vannel b",503217);

        Student s=new Student(100,"akhil","mail.com",2234223,a );

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(Integer.parseInt("10"));
        al.add(500);
        //al.add(s);//not integer so it is not allowed in integer generics
        al.add(7);
        System.out.println(al);
        Iterator<Integer> it =al.iterator();//generics
        //Iterator it= al.iterator();
        /*while (it.hasNext()){
            Object obj=it.next();
            if(obj instanceof String){
                String str=(String)obj;
            }//it is a tedious process we have to do this for every data type which is not the ideal solution
        }//so this is where the generics comes in picture
         */
        while (it.hasNext()){
            Integer i=it.next();
            System.out.println(i);
        }
        System.out.println("the below one is printed usind 'for each ' loop ");
        for(Integer i:al){
            System.out.println(i);
        }



    }
}
