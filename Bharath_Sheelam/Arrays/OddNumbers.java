package Assignment2;

public class OddNumbers {
    public static void main(String[] args) {
        int i[] = {0,1,2,3,4,5};
        for (int index=0; index<i.length;index++){
            if (i[index]%2!=0){
                System.out.println(i[index]);
            }
        }
    }
}
