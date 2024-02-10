package Interface;

public class ATMMain {
    public static void main(String[] args) {
        SBIATM sbiatm = new SBIATM();
        sbiatm.withdraw();
        sbiatm.getBalance();
        sbiatm.deposit();

        ATM atm = new SBIATM();
        atm.changePin();
        atm.getBalance();
        //atm.deposit(); can't call deposit with atm. Can be done only with sbiatm.

        SBIATM sa = (SBIATM) atm;
        sa.deposit();
    }
}
