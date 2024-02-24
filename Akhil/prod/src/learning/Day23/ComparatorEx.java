package learning.Day23;
import learning.Day18.Student;
import learning.Day18.Address;


import java.util.Comparator;

public class ComparatorEx implements Comparator<Student>{

    //String s="akhil";
    //String s1="reddy";


    @Override
    public int compare(Student s,Student s1) {
        if(s.studentid >s1.studentid){
            return 1;

        }
        else {
        return -1;

        }
    }

}


