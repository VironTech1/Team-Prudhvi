package learning.Assignments;

public class StudentInfo {
    String name;
    int id;
    int age;
    long phone;
    StudentInfo(int id,String name,int age,long phone){
        this.id=id;
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    public String toString(){
        return "id :"+id+" name "+name+" age "+age+" phone "+phone;
    }

}
