package Inheritance;

public class Developer extends Employee {

    // the following attributes are common for both developer and tester.
    //Hence they are written in another class Employee
    /*int employeeId;
    String name;
    double salary;*/
    int noOfClasses;
    int noOfMethods;
    int noOfLines;

    public void writeCode(){
        System.out.println("Code written");
    }

    public void integrateCode(){
        System.out.println("Code Integrated");
    }
}

/* registerAttendance(){}
   applyLeave(){}
   writeCode(){}
   integrateCode(){}
 */