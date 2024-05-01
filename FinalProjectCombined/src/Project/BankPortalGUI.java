package Project;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BankPortalGUI extends JFrame {
    private JLabel titleLabel;
    private JButton loginButton;
    private JButton createAccountButton;

    public BankPortalGUI() {

        setTitle("Bank Portal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        titleLabel = new JLabel("<html>Bank Portal<br><br></html>");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
        add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        loginButton = new JButton("Login");
        createAccountButton = new JButton("Create Account");
        buttonPanel.add(loginButton);
        buttonPanel.add(createAccountButton);
        add(buttonPanel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginGUI();
            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new CreateAccountGUI();
            }
        });
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BankPortalGUI();
            }
        });
    }
}