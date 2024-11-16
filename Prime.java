import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Num extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b;

    Num() {
        setTitle("Prime Validation");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        JLabel l1 = new JLabel("Enter the number");
        t1 = new JTextField();
        t2 = new JTextField();
        b = new JButton("Click Here");
        b.addActionListener(this);

        add(l1);
        add(t1);
        add(t2);
        t2.setEditable(false);
        add(b);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(t1.getText());
            boolean isPrime = checkPrime(num);
            if (isPrime) {
                t2.setText("Prime");
            } else {
                t2.setText("Not Prime");
            }
        } catch (NumberFormatException ex) {
            t2.setText("Invalid input");
        }
    }

    private boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Num();
    }
}
