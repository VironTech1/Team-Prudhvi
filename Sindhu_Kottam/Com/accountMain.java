package Com;

public class accountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account act1=new Account();
		act1.setActNo(1111);
		act1.setName("Sindhu");
		act1.setAddress("1257 E cherry st");
		act1.setBalance(343.45);
		act1.setPhoneNo(4175699);
		
		act1.display();
		Account act2=new Account();
		act2.setActNo(1112);
		act2.setName("Sonya");
		act2.setAddress("1257 E cherry st");
		act2.setBalance(143.45);
		act2.setPhoneNo(4175698);
		
		act2.display();
		Account act3=new Account();
		act3.setActNo(1114);
		act3.setName("Bhavya");
		act3.setAddress("11202 professional park dr");
		act3.setBalance(10000);
		act3.setPhoneNo(4175789);
		
		act3.display();
		
		Account act4=act3;
		act4.display();
		act4=new Account();
		act4.display();
		
		
	}

}
