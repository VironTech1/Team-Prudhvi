package Interface;

public class SBIATM extends SBIATMSpecific implements ATM{
    @Override
    public void withdraw() {
        System.out.println("Can withdraw");
    }

    @Override
    public void getBalance() {
        System.out.println("Gets Balance");
    }

    @Override
    public void changePin() {
        System.out.println("Change the pin");
    }

    @Override
    public void miniStatement() {
        System.out.println("mini statement of SBI");
    }
}
