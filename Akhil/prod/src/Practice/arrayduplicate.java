package Practice;
import java.util.*;

public class arrayduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[6];
        int counter=0;
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if (a[i] == a[j]&&i!=j) {
                    System.out.println("found the duplicate at the index "+j+" and the value of duplicate is "+a[j]);
                    counter++;


                }
            }
        }
        if(counter==0){
            System.out.println("no duplicate found");
        }
    }
}
