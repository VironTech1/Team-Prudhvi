abstract class Mobile {
    protected double balance;

    public Mobile(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void recharge(double amount);

    abstract void makeCall(double cost);

    void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class CellPhone extends Mobile {
    public CellPhone(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void recharge(double amount) {
        balance += amount;
        System.out.println("Mobile recharged by $" + amount);
    }

    @Override
    void makeCall(double cost) {
        if (balance >= cost) {
            balance -= cost;
            System.out.println("Call made. Cost: $" + cost);
        } else {
            System.out.println("Insufficient balance to make the call.");
        }
    }
}

public class Cell {
    public static void main(String[] args) {
        CellPhone myMobile = new CellPhone(50.0);
        myMobile.displayBalance();

        myMobile.recharge(20.0);
        myMobile.displayBalance();

        myMobile.makeCall(15.0);
        myMobile.displayBalance();
    }
}
