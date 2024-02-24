package learning.Day22;
import learning.Day18.Student;
import learning.Day18.Address;

import java.util.ArrayList;

import java.util.Scanner;

public class CollectionStudent {
    public static void main(String[] args) {
        Address a=new Address("8-12","gandhi bus stop","armooor","Telangana","vannel b",503217);
        Address a1=new Address("32","zphs","same","telangana state","vannel bashirabadh",23432);



        Student s=new Student(123,"akhil","akhil@mail.com",232343433,a);
        Student s1=new Student(453,"KITTU","kittu@mail.com",9878888,a1);
        Student s2=new Student(456,"KITTU reddy","kittu@mail.com",9878888,a);
        Student s3=new Student(459,"KITTU akhil","kittu@mail.com",9878888,a1);
        Student s4=new Student(323,"akhil reddy","kittu@mail.com",9878888,a);



        ArrayList al=new ArrayList();
        al.add(s);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        //int[] sarray= (int[]) al.get(0);

        //System.out.println(sarray[0]);
        System.out.println(al);

        Scanner  sc = new Scanner(System.in);

        int id = sc.nextInt();

        int counter=0;


        for(int i = 0; i<5;i++){

            if(id ==((Student)(al.get(i))).studentid ){
                System.out.println("the name of the student with the given id is");
                System.out.println(((Student)al.get(i)).name);
                counter++;
            }

        }
        if(counter==0){
            System.out.println("there is no student associated with the given id");
        }

        System.out.println();


    }
}
