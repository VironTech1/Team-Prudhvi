//day 11 practicing method overloading
//creating the methods in the class
package Practice;

public class Method {

    String str;

    private String trs;
    String RTS;
    int time;

    Method(String s,String f,int t,String g){//constructor
        str=s;
        trs=f;
        time=t;
        RTS=g;

    }
    void getdetails(){
        System.out.println(str);
        System.out.println(trs);
        System.out.println(time);
        System.out.println(RTS);
    }
    int add(int i,int j){//method
        int k=i+j;
        return k;

    }
    //String add( int i,int j){//doesnt allow because both of the classes have same names and same parameters
    // irrespective of the return type



    //}
    String add(int i,String s){
        String k=s+i;
        return k;
    }

    String add(String s,int i){
        String y=(String)(i+s);
        return y;

    }
}
