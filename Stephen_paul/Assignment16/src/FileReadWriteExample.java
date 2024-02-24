import java.io.*;

public class FileReadWriteExample {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Write to a file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, world!");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            System.out.println("File content: " + line);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
