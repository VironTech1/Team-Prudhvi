import java.util.Scanner;

//25. Wrtie a program to calculate Gold rate(rate for grm 5250, 10 grms=1 tula) including stones
// (each stone rate: 1500). Calute the price by mix of gold and stones and making charges will be 10 -18

public class Gold {
    public static void main(String[] args) {
        System.out.println("Enter the weight of Gold in grms");
        int grms = 5250;
        Scanner Gweight = new Scanner(System.in);
        float weightgold = Gweight.nextInt();
        float costofonlygold = grms * weightgold+18;
        System.out.println(costofonlygold + "PRICE OF GOLD NO STONE COST INCLUDED with Handling");
        System.out.println("ENTER 1 FOR STONE O FOR NO STONES");
        Scanner TFStone = new Scanner(System.in);
        int stoneinc = TFStone.nextInt();
        if (stoneinc == 1) {
            System.out.println(1500+costofonlygold+ "\n" + "Total Price INCLUDED WITH HANDLING AND STONE" );
        } else if (stoneinc ==0) {
            System.out.println("TOTAL PRICE WITH NO STONE AND HANDLING INCLUDED" + "\n" + costofonlygold);
        }

    }
}

