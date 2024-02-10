public class MAxArray {
    public static void main(String[] args) {
        int i;
        int[] Array = {1,6,5,2,3,4,9};
        int max = Array[0];
        int min = Array[0];
        for(i=0;i<Array.length;i++){
            if(Array[i]>max){
                max = Array[i];
            }
            else if(Array[i]<min){
                min = Array[i];
            }
        }
        System.out.println("max= "+max);
        System.out.println("min= "+min);
    }
}
