//10.Write a program to calculate EMI for given loan amount
// (Ex: Amount : 1,00,000 Tenure : 5 yrs, intrerest : EmI for month :17,093 with 1 % interest
//EMI = [P x R x (1+R)^N]/[(1+R)^N-1].

import java.util.Scanner;public class Emi {
    public static void main(String[] args){
        float EMI;
        int PrincipleAmount= 100000;
        int ROI= 1;
        int Tenture =5;
        EMI = (PrincipleAmount* ROI* (1+ROI)^Tenture)/((1+ROI)^Tenture-1);

        System.out.println("EMI for month" +EMI+ "\n"+ "with 1% interest");
    }
}
