//12. Write a program to calculate Hours to minutes & seconds and vic versa.

import java.util.Scanner;

public class HourstoMin {
    public static void main(String[] args) {
        Scanner H=new Scanner(System.in);
        Scanner M=new Scanner(System.in);
        System.out.println("Enter Hours to Convert into Minutes");
        System.out.println("Enter Miniutes to Convert into Hours");
        float Hours=H.nextInt();
        float Miniutes=M.nextInt();
        //convertions
        int hourstomin=(int)Hours*60;
        int Mintohours=(int)Miniutes/60;
        System.out.println("Converted to Minutes"+"\n"+ hourstomin+"Minutes");
        System.out.println("Converted to Hours"+"\n"+ Mintohours+"Hours");


    }
}
