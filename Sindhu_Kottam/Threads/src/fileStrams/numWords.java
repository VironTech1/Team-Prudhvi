package fileStrams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class numWords {

	public static void main(String[] args) throws FileNotFoundException {
		int count=0;
		// TODO Auto-generated method stub
		File f=new File("C://Users//kotta//OneDrive//Desktop//Data.txt");
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
	         count++;
	      }
	      System.out.println("Number of characters in the given file are " +count);

	}

}
