package fileStrams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		String word;
		// TODO Auto-generated method stub
		File f=new File("C://Users//kotta//OneDrive//Desktop//Data.txt");
		
		System.out.println("Enter the word to find in the file");
		
		word=sc.nextLine();
		FileInputStream fis = new FileInputStream(f);
		
	      byte[] bytesArray = new byte[(int)f.length()];
	      try {
			fis.read(bytesArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String s = new String(bytesArray);
	      String [] data = s.split(" ");
	      for (int i=0; i<data.length; i++) {
	         if(data[i].equals(word))
	         {
	        	 count++;
	         }
	         
	      }
	      System.out.println("Number of times "+word+" appeared in the file is " +count);

	}
}
