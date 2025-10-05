import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField display;
    private StringBuilder currentInput;
    private double operand1, operand2, result;
    private String operator;

    public SimpleCalculator() {
        currentInput = new StringBuilder();
        operator = "";
        operand1 = operand2 = result = 0;

        // Create the display field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create buttons
        String[] buttonLabels = {
                "7", "8", "9", "/", 
                "4", "5", "6", "*", 
                "1", "2", "3", "-", 
                "0", "C", "=", "+" 
        };

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Set up the frame layout
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Simple Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            currentInput.append(command);
            display.setText(currentInput.toString());
        } else if (command.matches("[/*\\-+]")) {
            if (currentInput.length() > 0) {
                operand1 = Double.parseDouble(currentInput.toString());
                currentInput.setLength(0);
            }
            operator = command;
        } else if (command.equals("=")) {
            if (currentInput.length() > 0) {
                operand2 = Double.parseDouble(currentInput.toString());
                switch (operator) {
                    case "/":
                        result = operand1 / operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "+":
                        result = operand1 + operand2;
                        break;
                }
                display.setText(String.valueOf(result));
                currentInput.setLength(0);
            }
        } else if (command.equals("C")) {
            currentInput.setLength(0);
            operator = "";
            operand1 = operand2 = result = 0;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleCalculator().setVisible(true);
        });
    }
}
