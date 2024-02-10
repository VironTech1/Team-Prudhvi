package Assignment2;

public class Max {
    public static void main(String[] args) {
        int i[] = {0,1,2,3,4,5};
        int max = -1;
        for (int index=0; index<i.length;index++){
            if (i[index]>max){
                max = i[index];
            }
        }
        System.out.println(max);
    }
}
