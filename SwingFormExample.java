import javax.swing.*;
import java.awt.event.*;

public class SwingFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Form");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(100, 20, 165, 25);
        frame.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 50, 80, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(100, 50, 165, 25);
        frame.add(emailField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 90, 100, 25);
        frame.add(submitButton);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(10, 120, 250, 25);
        frame.add(resultLabel);

        // Action Listener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                resultLabel.setText("Name: " + name + ", Email: " + email);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
