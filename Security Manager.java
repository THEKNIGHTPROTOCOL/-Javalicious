import java.io.FilePermission;
import java.security.Permission;

class CustomSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        if (perm instanceof FilePermission && perm.getActions().contains("write")) {
            throw new SecurityException("Writing to files is not allowed!");
        }
    }
}

public class SecurityExample {
    public static void main(String[] args) {
        System.setSecurityManager(new CustomSecurityManager());
        try {
            System.out.println("Trying to write to a file...");
            System.out.println("Operation not allowed!");
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        }
    }
}
