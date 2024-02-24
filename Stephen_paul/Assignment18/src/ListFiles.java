import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        String folderPath = "/Users/stephenchaganti/MyAssignments/Team-Prudhvi/Stephen_paul/Assignment14/src";
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.err.println("Folder is empty or cannot be read.");
            }
        } else {
            System.err.println("Invalid folder path.");
        }
    }
}
