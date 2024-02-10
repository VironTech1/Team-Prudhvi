package ConditionalStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the runs scored by the player:");
        int runs = scanner.nextInt();
        if (runs==100){
            System.out.println("The player is a Genius");
        }
        else if(runs<100 && runs>=90){
            System.out.println("The player is excellent");
        }
        else if(runs<90 && runs>=80){
            System.out.println("The player is good");
        }
        else{
            System.out.println("The player is average");
        }
    }
}
