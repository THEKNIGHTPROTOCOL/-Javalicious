import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeAwareCalculator extends JFrame implements ActionListener {

    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
    };
    private String currentInput = "";
    private double firstOperand = 0;
    private char operator;
    private JLabel timeLabel;
    private List<String> operationLog = new ArrayList<>();

    public TimeAwareCalculator() {
        setTitle("Time-Aware Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);

        JPanel timePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        timePanel.add(timeLabel);
        add(timePanel, BorderLayout.SOUTH);

        // Update time every second
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateTime();
            }
        }, 0, 1000);

        setVisible(true);
    }

    private void updateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        timeLabel.setText(formatter.format(now));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "+":
            case "-":
            case "*":
            case "/":
                if (!currentInput.isEmpty()) {
                    firstOperand = Double.parseDouble(currentInput);
                    operator = command.charAt(0);
                    currentInput = "";
                }
                break;
            case "=":
                if (!currentInput.isEmpty()) {
                    double secondOperand = Double.parseDouble(currentInput);
                    double result = calculate(firstOperand, secondOperand, operator);
                    display.setText(String.valueOf(result));
                    logOperation(firstOperand, secondOperand, operator, result);
                    currentInput = "";
                }
                break;
            default:
                currentInput += command;
                display.setText(currentInput);
                break;
        }
    }

    private double calculate(double first, double second, char operator) {
        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                if (second == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return first / second;
            default:
                return second;
        }
    }

    private void logOperation(double first, double second, char operator, double result) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String logEntry = formatter.format(now) + " : " + first + " " + operator + " " + second + " = " + result;
        operationLog.add(logEntry);
        // Optionally, print the log to console or write to a file.
        System.out.println(logEntry);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TimeAwareCalculator::new);
    }
}