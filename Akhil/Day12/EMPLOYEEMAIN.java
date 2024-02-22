package learning.Day12;

public class EMPLOYEEMAIN {

    public static void main(String[] args) {
        EMPLOYEE_SUB e=new EMPLOYEE_SUB();
        e.employeeid=1232;
        e.name="akhil";
        e.Applyleave();
        //e.testcode();//super class cannot access the subclass

        Developer d= new Developer();
        d.employeeid=3432;
        d.name="reddy";
        d.noofcalsses=4;
        d.Applyleave();
        d.integratecode();
        //d.testcode();//one sub class  cannot access the other subclass properties

        Tester t=new Tester();
        t.employeeid=45676;
        t.name="kittu";
        t.Applyleave();
        t.reportbugs();

        Automationtester at=new Automationtester();
        at.usetool();
        at.salary=345456;
        at.employeeid=435355;
        at.Applyleave();

    }
}
