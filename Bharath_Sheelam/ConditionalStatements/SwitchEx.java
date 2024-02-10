package ConditionalStatements;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter runs1: ");
        int runs1 = scanner.nextInt();
        System.out.println("Enter runs2: ");
        int runs2 = scanner.nextInt();


        System.out.println("Enter the option:");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Total runs " + (runs1 + runs2));
                break;
            case 2:
                if (runs1<runs2){
                System.out.println("Highest runs in an innings " + runs2);}
                break;
            default:
                System.out.println("The player scored centuries in both innings");
        }
    //pending: try different possibilities such as if statement inside the switch

        }
    }

