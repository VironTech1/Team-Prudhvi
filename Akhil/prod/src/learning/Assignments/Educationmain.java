package learning.Assignments;

public class Educationmain {
    public static void main(String[] args) {
        System.out.println("lets talk about eductaion");
        Education e=new Education();
        e.level="multilevel";
        e.institute="many institutes";
        e.Duration=100+"years if you stay alive that is \n as long as you are alive you gotta learn something";//that if you are alive
        e.head="thay change every time";



        e.info();
        e.stay();
        e.educationlevel();

        System.out.println("ano now lets talk about Schooling");

        Schooling s=new Schooling();
        s.drawing_teacher="alexandra";
        s.Duration=12+"years";
        s.head="joseph";//my school principle
        s.level="beginer";
        s.institute="sri chaitanya";
        s.playtime=4;

        s.LKGstudents=33;
        s.tenthstudents=75;
        s.draw();
        s.play();
        s.pt_sir="i dont remember";
        s.educationlevel();
        s.info();
        s.stay();

        System.out.println("now lets talk about intermediate college");

        Intermediate i =new Intermediate();
        i.Duration=2+"years";
        i.head="srinivas rao";
        i.fristyearstudents=45;
        i.secondyearstudsents=22;
        i.level="as the name suggest it is intermediate level";
        i.highestemcetrank=1;//not true just kidding it might be around 100's i guess  mine was around 4k
        i.institute="sri chaitanya college of intermediate";
        i.emcet();
        i.IPE();
        i.educationlevel();
        i.info();
        i.stay();

        System.out.println("this is about Self learning the best of all");

        Selflearning Akhil=new Selflearning();
        Akhil.Duration="lifetime";
        Akhil.head="my self";
        Akhil.institute="nothing specific";
        Akhil.level="ULTIMATE";
        Akhil.motive="your mood shouldn't decide what you should your discipline should";
        Akhil.time=2+"hrs per day i guess as a beginner";
        Akhil.discipline();
        Akhil.stay();//this is where overriding happens
        Akhil.educationlevel();
        Akhil.info();

        Btech bt=new Btech();
        bt.branch="ECE";
        bt.motive="at this timne i didn't really have much motivation i was bit interested in nutrition than in ECE";
        bt.time="5 days in a week";
        bt.year="i have completed my graduation so i would say all four years";
        bt.Duration="4years";
        bt.head="i do not remember his name";
        bt.institute="vellore institute of technologyl";
        bt.level="undergrad";
        bt.graduate();;
        bt.discipline();
        bt.stay();
        bt.educationlevel();
        bt.graduate();
        bt.info();

    }
}
