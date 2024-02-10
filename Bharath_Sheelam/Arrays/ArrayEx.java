package Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] i = new int[5];
        //System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]+" "+i[4]);

        i[0]=100;
        i[1]=200;
        i[2]=300;
        //System.out.println(i[0]+" "+i[1]+" "+i[2]);
        //System.out.println(i[4]);
        int j = i[2];
        //System.out.println(j);
        for (int index=0; index<i.length; index++ ){
            System.out.println(i[index]);
        }
        int[] a = {0,183,139,254,235,187};
        for (int index=0; index<a.length; index++){
            System.out.println(a[index]);
        }
    }
}
