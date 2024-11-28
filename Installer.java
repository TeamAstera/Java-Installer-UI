package teamastera.simple.uis

import javax.swing.*;
import java.awt.*;

public class Installer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Astera Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 180);
        frame.setLayout(new GridBagLayout());
        frame.setUndecorated(true);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 15, 5, 15);
        Font font = new Font("Arial", Font.PLAIN, 30);
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.decode("#222222"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.2;
        frame.add(topPanel, gbc);

        JLabel label = new JLabel("AsteraClient");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(font);
        topPanel.add(label);
        JTextField usernameField = new JTextField(15);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.decode("#DDDDDD")));
        usernameField.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0.3;
        frame.add(usernameField, gbc);

        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.decode("#DDDDDD")));
        passwordField.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0.3;
        frame.add(passwordField, gbc);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.decode("#800080"));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorderPainted(false);
        loginButton.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 0.2;
        frame.add(loginButton, gbc);

        frame.getContentPane().setBackground(Color.decode("#222222"));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
