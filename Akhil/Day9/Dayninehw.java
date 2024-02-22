//day 9 assignment
//methods
package learning.Day9;

public class Dayninehw {

    public static void main(String[] args) {
        participant canded=new participant();
        canded.name="Akhil";
        canded.address="addr1";
        canded.phone=91354985;

        Meeting meet1=new Meeting();
        meet1.createmeeting("http.bharath.com",3,"bharath bhai",canded);
        meet1.details();




    }
}
