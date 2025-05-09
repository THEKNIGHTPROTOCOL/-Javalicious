import java.io.*;

public class CheckedEx {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
