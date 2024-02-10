package Com;

public class Account {

	int actNo;
	String Address;
	String name;
	double balance;
	long phoneNo;
	public int getActNo() {
		return actNo;
	}
	public void setActNo(int actNo) {
		this.actNo = actNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("Account Number:"+actNo);
		System.out.println("Address:"+Address);
		System.out.println("phoneno:"+phoneNo);
		System.out.println("balance:"+balance);
	}
}
