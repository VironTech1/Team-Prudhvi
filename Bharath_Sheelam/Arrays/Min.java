package Assignment2;

public class Min {
    public static void main(String[] args) {
        int i[] = {0,1,2,3,4,5};
        int min = 0;
        for (int index=0; index<i.length;index++){
            if (i[index]<min){
                min = i[index];
            }
        }
        System.out.println(min);
    }
}
