package learning.Assignments;

public class Selflearning extends Education{
    String time;
    String motive;

    void stay(){
        System.out.println("well i am with me all the time so its a "+Duration+" learning process");

    }
    void discipline(){
        System.out.println(motive);
    }
}

class Btech extends Selflearning{
    String branch;
    String year;

    void graduate(){
        System.out.println("yup i have completed my undergrad\ninfact i have also completed my graduation just recently");
    }
}
