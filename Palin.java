import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Palin extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b;

    Palin() {
        setTitle("Palindrome Checker");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, spacing of 10px

        // Components
        JLabel l = new JLabel("Enter a number:");
        t1 = new JTextField(15);
        b = new JButton("Check");
        t2 = new JTextField(15);

        t2.setEditable(false);

        // Add components to the frame
        add(l);
        add(t1);
        add(b);
        add(new JLabel("Result:")); // Placeholder for better alignment
        add(t2);

        // Button action listener
        b.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();

        if (Palindrome.isPalindrome(s)) {
            t2.setText("Palindrome");
            Palindrome.writeToFile("Palindrome");
        } else {
            t2.setText("NOT Palindrome");
            Palindrome.writeToFile("Not Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        new Palin();
    }

    static boolean isPalindrome(String S) {
        int n = S.length();
        int r = n - 1;
        for (int i = 0; i < n / 2; i++) {
            if (S.charAt(i) != S.charAt(r))
                return false;
            r--;
        }
        return true;
    }

    static void writeToFile(String result) {
        try (FileWriter f = new FileWriter("Palindrome.txt")) {
            f.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

