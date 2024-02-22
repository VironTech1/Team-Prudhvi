package learning.Day23;

import java.util.ArrayList;
import java.util.Iterator;
import learning.Day18.Student;
import learning.Day18.Address;

public class IteratorEX {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();

        Address a=new Address("8-12","gandhi bus stop","armooor","Telangana","vannel b",503217);
        Address a1=new Address("32","zphs","same","telangana state","vannel bashirabadh",23432);

        Student s=new Student(123,"akhil","akhil@mail.com",232343433,a);
        Student s1=new Student(453,"KITTU","kittu@mail.com",9878888,a1);
        Student s2=new Student(456,"KITTU reddy","kittu@mail.com",9878888,a);
        Student s3=new Student(459,"KITTU akhil","kittu@mail.com",9878888,a1);
        Student s4=new Student(323,"akhil reddy","kittu@mail.com",9878888,a);

        al.add(s);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(100);
        al.add(4);
        Iterator it=al.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
