import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "/Users/stephenchaganti/MyAssignments/Team-Prudhvi/Stephen_paul/Assignment14/src/StringReverse.java";
        String wordToCount = "public";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToCount)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + wordToCount + "' appears " + count + " times in the file.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

