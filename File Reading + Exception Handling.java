import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line.toUpperCase()); // example operation
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name.");
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
