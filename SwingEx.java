import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NumApp extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b;

    NumApp() {
        setTitle("Number App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel l1 = new JLabel("Enter a number here");
        t1 = new JTextField();
        JLabel l2 = new JLabel("Previous Number");
        t2 = new JTextField();
        JLabel l3 = new JLabel("Next Number");
        t3 = new JTextField();
        b = new JButton("Click Here");

        b.setBounds(100, 150, 80, 50);  // This line is not necessary with GridLayout
        b.addActionListener(this);

        add(l2);
        add(l1);
        add(l3);
        add(t2);
        t2.setEditable(false);
        add(t1);
        add(t3);
        t3.setEditable(false);
        add(b);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();
        int n = Integer.parseInt(s);
        t2.setText(String.valueOf(n - 1));
        t3.setText(String.valueOf(n + 1));
    }
}

public class SwingEx {
    public static void main(String[] args) {
        NumApp num = new NumApp();
    }
}
