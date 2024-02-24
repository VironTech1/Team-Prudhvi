//day 8 in calss lecture and assignment
//assignment - address should stotre 4 values instead of just one
//Student s3=stud1;//assignment
//        s3.studentid=20772;
//what will the value be of stud1?
//what are their hashcodes and why are they like that
package learning.Day18;


public class Address {//assignment
    String hno;
    String landmark;
    String city;
    String state;
    String village;
    int zipcode;
    public Address(String houseno, String landmark, String city, String s, String v, int z){
        hno=houseno;
        this.landmark=landmark;
        this.city=city;
        state=s;
        village=v;
        zipcode=z;

    }
    Address(){

    }
}


class Studentmain {
    public static void main(String[] args) {

        int i = 10;
        String str = "sunny";
        int[] a = {12, 2, 3, 4, 5};
        //      ={12,"akhil",1111,"ade@mail.com,342};//by default java does know in what memory it should store this
        // so this is where object comes in picture
        Student stu1 = new Student();
        stu1.email = "stu1.mail";
        stu1.studentid = 1111;
        stu1.phone = 11111111;
        stu1.name = "stu1";
        String str1 = new String("hello");
        Integer i1 = new Integer(10);
        System.out.println(str1.toString());
        System.out.println(i1.toString());
        System.out.println(stu1.toString());



        /*Student stud1= new Student();

        Student stud2 = new Student();

        stud1.studentid=343;
        stud2.studentid=657;
        stud1.name="kittu";
        stud2.name="akhil";
        stud1.address.hno="8-12";//assignment
        stud1.address.landmark="gandhi bus stop";
        stud2.address.hno="8-12";
        stud2.address.landmark="zilla parishath high school";
        stud1.address.city="nizamabad";
        stud2.address.city="nizamabad";
        stud1.address.village="vannel 'b' ";
        stud2.address.village="vannel (bashirabadh)";
        stud1.address.state="telangana";
        stud2.address.state="TELANGANA";
        stud1.address.zipcode=503217;
        stud2.address.zipcode=503217;



        // stud1.password=" reddy"//it throws error because we define it before


        System.out.println("ID "+stud1.studentid);
        System.out.println(" name "+stud1.name);
        System.out.println("mail "+stud1.email);
        System.out.println(" phone "+stud1.phone);
        System.out.println("hno " +stud1.address.hno);
        System.out.println("landmark "+stud1.address.landmark);
        System.out.println("city : "+stud1.address.city);
        System.out.println("state : "+stud1.address.state);
        System.out.println("village : "+stud1.address.village);
        System.out.println("zipcode : "+stud1.address.zipcode);


        System.out.println("ID "+stud2.studentid);
        System.out.println(" name "+stud2.name);
        System.out.println("mail "+stud2.email);
        System.out.println(" phone "+stud2.phone);
        System.out.println("hno " +stud2.address.hno);
        System.out.println("landmark "+stud2.address.landmark);
        System.out.println("city : "+stud2.address.city);
        System.out.println("state : "+stud2.address.state);
        System.out.println("village : "+stud2.address.village);
        System.out.println("zipcode : "+stud2.address.zipcode);

        Student s3=stud1;//assignment
        s3.studentid=20772;
        System.out.println("student ID : "+stud1.studentid);
        System.out.println("student ID : "+s3.studentid);
        System.out.println("hashcode of stud1 : "+stud1);
        System.out.println("hashcode of s3 : "+s3);

         */


    }
}
