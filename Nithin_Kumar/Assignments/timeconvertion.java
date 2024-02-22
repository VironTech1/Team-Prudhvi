package Assignments;

import java.util.Scanner;

public class timeconvertion {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        int hours = s.nextInt();
        int min = hours * 60;
        double seconds = min * 60;
        System.out.println("time in minutes: " + min + " min");
        System.out.println("time in seconds: " + seconds + " sec");
        double minconv = min / 60;
        double hoursconv = minconv / 60;
        System.out.println("time in minutes (converted back): " + minconv + " min");
        System.out.println("time in hours (converted back): " + hoursconv + " hours");
	}

}
