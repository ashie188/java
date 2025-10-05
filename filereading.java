import java.io.*;

public class FileReadingExample {
    public static void main(String[] args) {
        // Specify the path of the file to be read
        String filePath = "path/to/your/file.txt";

        try {
            // Create a FileReader object
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader object to efficiently read from the FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line here
                System.out.println(line);
            }

            // Close the BufferedReader
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
