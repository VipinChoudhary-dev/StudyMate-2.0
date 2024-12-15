import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        // Set Look and Feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create Frame for Login
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLayout(null);

        // Create Labels
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(200, 200, 100, 30);  // Adjusted for better placement in 800x700 frame
        frame.add(userLabel);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(200, 250, 100, 30);  
        frame.add(passLabel);

        // Create Text Fields
        JTextField userField = new JTextField();
        userField.setBounds(300, 200, 300, 30);  
        frame.add(userField);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(300, 250, 300, 30); 
        frame.add(passField);

        // Create Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(350, 300, 100, 30);  
        frame.add(loginButton);

        // Login Button Action Listener
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Check credentials
                if ("VPS".equals(username) && "vps123".equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose(); // Close login window

                    // Launch StudyMate
                    StudyMate.main(null);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Display Frame
        frame.setVisible(true);
    }
}
