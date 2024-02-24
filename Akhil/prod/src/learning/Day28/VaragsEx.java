package learning.Day28;

public class VaragsEx {
    public static void main(String... args) {
        //int[] a={2,3,4,5,4,5,2,5};
        callme("akhil" ,2,3,4,5,6,7,8,9);
    }
    public static void callme(String str ,int... i){
        int total=0;
        for(int value : i){
            total=total+value;
        }
        System.out.println(str+total);

    }
}
