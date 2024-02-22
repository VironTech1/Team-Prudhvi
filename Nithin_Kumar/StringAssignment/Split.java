package StringAssignment;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "NithinKunalReddy Mandadi";
		String[] split = name.split(" ");
		if (split.length==2) {
			String FristName = split[0];
			String LastName = split[1];
			System.out.println("Full Name ="+name);
			System.out.println("First Name = " +FristName);
			System.out.println("Last Name = "+ LastName);
		}
		else {
			System.out.println("Invalid Name given");
		}

	}

}
