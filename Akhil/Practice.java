package learning;

import java.io.File;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File directory = new File("C:\\Users\\Akhil Reddy\\Documents\\VIRON\\JAVA\\codebase\\Team-Prudhvi\\Akhil");

        File[] files = directory.listFiles();

        if (files != null) {
            int fileCount = files.length;
            System.out.println("Number of files in the directory: " + fileCount);

            System.out.println("File names in the directory:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("The directory is empty.");
        }
        /*

        System.out.print("enter the armstrong number : ");

        int arms = sc.nextInt();

        int sumarm = 0;
        int armsd = arms;
        int armsd1 = arms;
        int counterarm = 0;
        while (arms != 0) {
            int r = (arms % 10);

            counterarm++;
            arms = arms / 10;

        }
        int narm = counterarm;

        while (armsd != 0) {
            int ra = (armsd % 10);
            sumarm = (int) (sumarm + Math.pow(ra, narm));
            armsd = armsd / 10;
        }
        if (sumarm == armsd1) {
            System.out.println("it is armstrong number");
        } else {
            System.out.println("not armstrong");
        }

         */
    }
}
