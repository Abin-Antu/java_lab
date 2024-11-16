import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PhoneApp extends JFrame implements ActionListener {
    private JTextField display;
    private JButton callButton;
    private String phoneNumber = "";

    public PhoneApp() {
        setTitle("Phone App");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 3, 5, 5));

        // Display field
        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display);

        // Number buttons (1-9)
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            add(button);
        }

        // Clear button
        JButton clearButton = new JButton("CLEAR");
        clearButton.addActionListener(this);
        add(clearButton);

        // Zero button
        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        add(zeroButton);

        // Call/Hang Up button
        callButton = new JButton("CALL");
        callButton.addActionListener(this);
        add(callButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "CALL":
                if (!phoneNumber.isEmpty()) {
                    callButton.setText("HANG UP");
                    display.setText(phoneNumber);
                }
                break;

