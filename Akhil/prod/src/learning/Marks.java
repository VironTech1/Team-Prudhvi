package learning;

public enum Marks{

      MIN_MARK,MAX_MARK(100);
           int value;
           Marks(){
               System.out.println("no argument constructor");
           }
           Marks(int value){
               System.out.println("argument constuctor");
               this.value=value;
           }  
}