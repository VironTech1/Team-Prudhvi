package learning.Day18;

public class Student {
    public static int studentid;//instance variables
    public String name;
    public String email;
    public long phone;
    Address address = new Address();//assignment

    public Student(int ID, String na, String mail, long mobile, Address a){
        studentid=ID;
        name=na;
        email=mail;
        phone=mobile;
        address=a;
    }
    Student(){

    }

    public String toString() {


        return "studentid : " + studentid + " name : " + name + " mail " + email + " mobile " + phone+" hno "+ address.hno+" landmark "+ address.landmark+ " city "+address.city+" state "+address.state+" village "+address.village+ " zipcode "+address.zipcode;
    }


}
