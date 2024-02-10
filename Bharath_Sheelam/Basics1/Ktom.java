//11. Write a program to calculate kilo meters to meters and cm and vic versa
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ktom {
    public static void main(String[] args){
        Scanner Kilometers=new Scanner(System.in);
        Scanner Meters=new Scanner(System.in);
        System.out.println("Enter the KMS to Covert into Meters" );
        System.out.println("Enter values to convert meters to kms ");
        int Kms;
        float M;
        Kms=Kilometers.nextInt();
        M=Meters.nextInt();
        //convertion KMS to Meters
            float Metersconvertion= Kms*1000;
            float Kmsconvertion= Kms/M;
        System.out.println("Converted to meters"+"\n"+ Metersconvertion);
        System.out.println("Converted to KMS "+"\n"+ Kmsconvertion);


    }
}
