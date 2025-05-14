import java.util.*;
import java.io.*;

public class ReadProperties {
    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            prop.load(fis);

            String user = prop.getProperty("username");
            String pass = prop.getProperty("password");

            System.out.println("Username: " + user);
            System.out.println("Password: " + pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
