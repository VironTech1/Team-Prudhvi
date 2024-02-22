package learning.Day24;

import learning.Day18.Address;
import learning.Day18.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMap {
    public static void main(String[] args) {


        Address a = new Address("8-12", "gandhi bus stop", "armooor", "Telangana", "vannel b", 503217);
        Address a1 = new Address("32", "zphs", "same", "telangana state", "vannel bashirabadh", 23432);


        Student s = new Student(123, "akhil", "akhil@mail.com", 232343433, a);
        Student s1 = new Student(453, "KITTU", "kittu@mail.com", 9878888, a1);
        Student s2 = new Student(456, "KITTU reddy", "kittu@mail.com", 9878888, a);
        Student s3 = new Student(459, "KITTU akhil", "kittu@mail.com", 9878888, a1);
        Student s4 = new Student(323, "akhil reddy", "kittu@mail.com", 9878888, a);
        Map<Integer, Student> m=new HashMap();
        m.put(123,s);
        m.put(453,s1);
        m.put(456,s2);
        m.put(459,s3);
        m.put(323,s4);
        m.putIfAbsent(123,s1);//will not change any as it already as 123
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.get(123));
        System.out.println(m.values());
        Set<Map.Entry<Integer,Student>> Studentset=m.entrySet();
        for(Map.Entry<Integer,Student> pair:Studentset){
            System.out.println(pair.getKey()+" = "+pair.getValue());
        }

    }
}
