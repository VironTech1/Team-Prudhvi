package Latest_Assignemnts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentInfoMain {
    public static void main(String[] args) {
        StudentInfo s1=new StudentInfo(1,"akhil",24,987898789);
        StudentInfo s2=new StudentInfo(2,"reddy",25,543245653);
        StudentInfo s3=new StudentInfo(3,"karthik",23,234543223);
        StudentInfo s4=new StudentInfo(4,"nagulapally",28,999999999);
        StudentInfo s5=new StudentInfo(5,"nihal",25,234567897);
        ArrayList<StudentInfo> al=new ArrayList<StudentInfo>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("enter the id to search :");
            int stid = sc.nextInt();
            for (StudentInfo s : al) {
                if (stid == s.id) {
                    System.out.println("the name of the student with id " + stid + " is " + s.name);
                }
            }
            System.out.print("enter the student id for the person who needs a name change");
            int std2 = sc.nextInt();
            System.out.println("enter the name");

            String str = sc.nextLine();
            String str1=sc.nextLine();

            for (StudentInfo s : al) {
                if (std2 == s.id) {
                    s.name = str1;
                }
            }
            System.out.println("students in the array after modification");
            for (StudentInfo s : al) {
                System.out.println(s);
            }
            Iterator<StudentInfo> si= al.iterator();
            System.out.print("enter the id of the student to be deleted : ");
            int stid1 = sc.nextInt();
            while(si.hasNext()) {
                    if (si.next().id ==stid1) {
                        si.remove();
                    }
                }
            //after deletion
            System.out.println("students in the array after deletion");
            for (StudentInfo s : al) {
                System.out.println(s);
            }

        }
        catch (Exception e){
            System.out.println("exception caught");
        }
        finally {
            System.out.println("compulsory executable block");
        }
    }

}
