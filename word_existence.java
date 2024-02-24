//2.Search the word existence

package Latest_Assignemnts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class word_existence {
    public static void main(String[] args) {
        String filePath = "S:\\Java_Codes\\Latest_Assignemnts\\data.txt";
        String wordToSearch = "hi";

        try {
            boolean exists = searchWord(filePath, wordToSearch);
            if (exists) {
                System.out.println("The word \"" + wordToSearch + "\" exists in the file.");
            } else {
                System.out.println("The word \"" + wordToSearch + "\" does not exist in the file.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static boolean searchWord(String filePath, String word) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}