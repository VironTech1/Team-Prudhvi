package Assignment2;

public class Duplicate {
    public static void main(String[] args) {
        int [] i = {1,2,3,4,4,5,5,1};
        System.out.println("The array has duplicate values and they are: ");
        for (int index = 0; index<i.length;index++){
            for(int j= index+1; j<i.length; j++){
                if(i[index]==i[j]){
                    System.out.println(i[index]);
                }
            }

        }
    }
}
