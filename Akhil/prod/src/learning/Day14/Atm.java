//day 14 in class
//interface
package learning.Day14;

public interface Atm {
    public abstract void withdraw();
    abstract void getbalance();
    public void changePin();
    void ministatement();
}

class SBIAtm implements Atm{
    public void withdraw(){
        System.out.println("SBI withdraw");
    }
    public void getbalance(){
        System.out.println("SBI get balance");
    }
    public void changePin(){
        System.out.println("sbi pin change");
    }
    public void ministatement(){
        System.out.println("sbi ministatement");
    }


}
class ICIC implements Atm{
    public void withdraw(){
        System.out.println("icic withdraw");
    }
    public void getbalance(){
        System.out.println("icic get balance");
    }
    public void changePin(){
        System.out.println("icic pin change");
    }
    public void ministatement(){
        System.out.println(" icic ministatement");
    }


}
