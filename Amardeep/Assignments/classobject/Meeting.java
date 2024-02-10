package classobject;

public class Meeting {
	
	
		String url="www.abc.com";
		String time="11:11:11";
		String host="abcd";
		String participant;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			Meeting m=new Meeting();
			System.out.println(m.url);
			System.out.println(m.time);
			System.out.println(m.host);
			
			Participant p=new Participant();
			System.out.println(p.name);
			System.out.println(p.phonenumber);
			System.out.println(p.address);
			
			

		}

	

}
