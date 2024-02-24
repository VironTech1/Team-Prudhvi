package InheritanceAssignment;

public class Mobile {
     double balance;

    public Mobile() {
        this.balance = 0.0;
    }

    public void recharge(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Recharge successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid recharge amount. Please enter a positive amount.");
        }
    }

    public void makeCall(double costPerMinute, int minutes) {
        double callCost = costPerMinute * minutes;
        if (balance >= callCost) {
            balance -= callCost;
            System.out.println("Call successful. Call cost: " + callCost + ", Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Please recharge to make a call.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
