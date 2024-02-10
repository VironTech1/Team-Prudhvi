import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        int x= input.nextInt();
        int y= input1.nextInt();
        int z= input2.nextInt();

        float Answer=(x*3)+(y*3)+(z*3);
        System.out.println(Answer);
        }
    }
