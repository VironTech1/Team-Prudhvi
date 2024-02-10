package feb_7;

import java.util.Scanner;

public class splitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ENter the string");
String str=s.nextLine();
//System.out.println(str);

String[] sub=str.split(" ");
for(int i=0;i<sub.length;i++)
System.out.println(sub[i]);

}

}

