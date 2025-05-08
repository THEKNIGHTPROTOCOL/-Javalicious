import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    Button b;

    MyFrame() {
        b = new Button("Click Me");
        b.setBounds(50, 100, 80, 30);
        b.addActionListener(this); // Registering event
        add(b);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
