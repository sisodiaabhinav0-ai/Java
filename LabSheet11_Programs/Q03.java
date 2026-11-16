import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Q3. Student Login Form - Swing
public class Q03 extends JFrame implements ActionListener {
    // predefined credentials
    static final String USERNAME = "admin";
    static final String PASSWORD = "admin123";

    JTextField tfUser = new JTextField(15);
    JPasswordField pfPass = new JPasswordField(15);
    JButton btnLogin = new JButton("Login");
    JButton btnReset = new JButton("Reset");

    Q03() {
        setTitle("Student Login Form");
        setLayout(new GridLayout(3, 2, 10, 15));
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JLabel("Username:"));
        add(tfUser);
        add(new JLabel("Password:"));
        add(pfPass);
        add(btnLogin);
        add(btnReset);

        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);

        setSize(380, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String user = tfUser.getText().trim();
            String pass = new String(pfPass.getPassword());

            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both username and password",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(this, "Login Successful! Welcome " + user,
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password",
                        "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnReset) {
            tfUser.setText("");
            pfPass.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q03());
    }
}
