package JDBC;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class LoginUI extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;
    JButton loginButton;


    public LoginUI() {

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 30, 100, 300);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(120, 100, 130, 30);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 130, 100, 30);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 130, 130, 30);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 160, 80, 30);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login button clicked!");
            }

        });
        setVisible(true);
    }
}
    
