import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciCalculator extends JFrame implements ActionListener {
    private JTextField t1, t3;
    private JButton b1;

    public FibonacciCalculator() {
        setTitle("Fibonacci Series Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10)); // 3 rows, 1 column with gaps

        // Input field with label
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Enter count:"));
        t1 = new JTextField(10);
        inputPanel.add(t1);
        add(inputPanel);

        // Button
        b1 = new JButton("Calculate");
        b1.addActionListener(this);
        add(b1);

        // Result field
        t3 = new JTextField();
        t3.setEditable(false);
        add(t3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                int count = Integer.parseInt(t1.getText());
                t3.setText(calculateFibonacci(count));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid integer.");
            }
        }
    }

    private String calculateFibonacci(int count) {
        if (count <= 0) return "Please enter a positive integer.";
        String result = "0";
        int num1 = 0, num2 = 1;

        for (int i = 1; i < count; i++) {
            result += " " + num2; // Concatenate each Fibonacci number
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        new FibonacciCalculator();
    }
}

