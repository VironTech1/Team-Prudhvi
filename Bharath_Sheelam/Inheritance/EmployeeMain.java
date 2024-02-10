package Inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeId=198376;
        employee.name="Dhoni";
        employee.salary=928736789;
        employee.registerAttendance();

        Developer developer = new Developer();
        developer.employeeId=98765876;
        developer.name="Kohli";
        developer.salary=987654567;
        developer.noOfClasses=9876987;
        developer.noOfMethods=8765456;
        developer.applyLeave();
        developer.writeCode();
        developer.integrateCode();

        Tester tester = new Tester();
        tester.employeeId=987649876;
        tester.name="Rohit";
        tester.salary=98765489;
        tester.noOfBugs=987654;
        tester.noOfTestCases=876567;
        tester.registerAttendance();
        tester.testCode();

        AutomationTester automationTester = new AutomationTester();
        automationTester.employeeId=9876543;
        System.out.println("Automation Tester accessing employee class below");
        automationTester.registerAttendance();
        automationTester.applyLeave();
        System.out.println("Accessing tester class");
        automationTester.testCode();
        automationTester.useFrameWorks();
    }
}
