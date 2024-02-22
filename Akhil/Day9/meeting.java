//day 9 assignment
//methods
package learning.Day9;

class Meeting {

    String url;
    int time;
    String host;
    participant canded;

    void details() {
        System.out.println(url);
        System.out.println(time);
        System.out.println(host);
        System.out.println(canded.name);
        System.out.println(canded.address);
        System.out.println(canded.phone);

    }
                   //"akhil",19,"reddy",
    void createmeeting(String ur,int t,String h,participant ca){//
        url=ur;
        time=t;
        host=h;
        canded=ca;



    }
}

class participant{
    String name;
    long phone;
    String address;
}


