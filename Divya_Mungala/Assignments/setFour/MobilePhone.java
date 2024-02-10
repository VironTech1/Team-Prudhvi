package setFour;

public class MobilePhone {

	
	    private double balance;

	    public MobilePhone(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void recharge(double amount) {
	        balance += amount;
	        System.out.println("Recharge successful. New balance: " + balance);
	    }

	    public void makeCall(double callCost) {
	        if (balance >= callCost) {
	            balance -= callCost;
	            System.out.println("Call made successfully. Remaining balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance to make the call.");
	        }
	    }

	    public static void main(String[] args) {
	        MobilePhone myPhone = new MobilePhone(50.0); // Initial balance of 50

	        // Perform actions: Recharge and Make Calls
	        myPhone.makeCall(10.0);
	        myPhone.recharge(20.0);
	        myPhone.makeCall(30.0);
	    }
	}

