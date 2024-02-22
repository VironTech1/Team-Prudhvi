package learning.Day21;

public class ArrayDoubt {
    public static void main(String[] args) {

        int[] a={2,3,457,3};

        callme(a);

        int[] b={2,3,457,3,8,6};

        callme(b);

    }
    public static void callme(int[] args) {
        for(int i=0;i< args.length;i++) {

            System.out.println(args[i]);
        }




    }
}
