
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;


	
	public class WordSearch {
	    public static void main(String[] args) {
	        String filePath = "/Users/Divya/MyAssignments/Team-Prudhvi/Divya/Assignment14/src/StringReverse.java";
	        String wordToFind = "class";

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            int lineNumber = 1;
	            while ((line = br.readLine()) != null) {
	                if (line.contains(wordToFind)) {
	                    System.out.println("Word found at line " + lineNumber + ": " + line);
	                }
	                lineNumber++;
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    }
	}

