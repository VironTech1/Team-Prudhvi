import java.util.Scanner;

//19. Write a program to calculate
// current bill based on units(Units : 1-100 - 3rs, 101- 200- 4rs, 201 -300- 5 rs, 301 and above 6 rs) ?
public class Currentbill {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("ENTER THE UNITS");
        int currentunits=c.nextInt();

        if (currentunits<=100) {
            System.out.println("3rs Charge ");
        }
        else if(currentunits>100 && currentunits<=200) {
            System.out.println("4rs charge");
        }
        else if(currentunits>200 && currentunits<=300){
                System.out.println("5rs Charge");
                }

            }
        }


