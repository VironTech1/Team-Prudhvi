package learning.Day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ColectionFrameWorks {
    public static void main(String[] args) {
        //ArrayList al=new ArrayList();//it is ordered list //first come first serve
        //HashSet al=new HashSet();//unordered//no duplicates
        //TreeSet al=new TreeSet();//only homogeneous values //and it  sorts the values//no duplicates
        PriorityQueue al=new PriorityQueue();//only homogeneous //allows duplicates//it sorts
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
       System.out.println(al);
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println(al);//the arraylist allows duplicates //but the hashset doesn't
        //al.add("hello");//tree set and priority queue  don't allow heterogeneous values
        System.out.println(al);
        al.remove(100);
        System.out.println(al);



    }
}
