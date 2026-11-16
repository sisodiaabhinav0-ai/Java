import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Q10. Mini Banking GUI Application - Swing
public class Q10 extends JFrame implements ActionListener {
    JTextField tfAccount = new JTextField(15);
    JTextField tfName = new JTextField(15);
    JTextField tfBalance = new JTextField(15);
    JTextField tfAmount = new JTextField(15);
    JButton btnDeposit = new JButton("Deposit");
    JButton btnWithdraw = new JButton("Withdraw");
    JButton btnCheck = new JButton("Check Balance");
    JButton btnClear = new JButton("Clear");

    Q10() {
        setTitle("Mini Banking Application");
        setLayout(new GridLayout(6, 2, 10, 12));
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        add(new JLabel("Account Number:"));
        add(tfAccount);
        add(new JLabel("Customer Name:"));
        add(tfName);
        add(new JLabel("Current Balance:"));
        add(tfBalance);
        add(new JLabel("Amount:"));
        add(tfAmount);
        add(btnDeposit);
        add(btnWithdraw);
        add(btnCheck);
        add(btnClear);

        btnDeposit.addActionListener(this);
        btnWithdraw.addActionListener(this);
        btnCheck.addActionListener(this);
        btnClear.addActionListener(this);

        setSize(430, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btnClear) {
            tfAccount.setText("");
            tfName.setText("");
            tfBalance.setText("");
            tfAmount.setText("");
            return;
        }

        if (tfAccount.getText().trim().isEmpty() || tfName.getText().trim().isEmpty()) {
            showError("Please enter account number and customer name");
            return;
        }

        double balance;
        try {
            balance = Double.parseDouble(tfBalance.getText().trim());
            if (balance < 0) {
                showError("Current balance cannot be negative");
                return;
            }
        } catch (NumberFormatException ex) {
            showError("Please enter a valid current balance");
            return;
        }

        if (source == btnCheck) {
            JOptionPane.showMessageDialog(this,
                    "Account No : " + tfAccount.getText().trim() + "\n"
                    + "Customer   : " + tfName.getText().trim() + "\n"
                    + String.format("Balance    : %.2f", balance),
                    "Balance", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Deposit and Withdraw need a valid amount
        double amount;
        try {
            amount = Double.parseDouble(tfAmount.getText().trim());
            if (amount <= 0) {
                showError("Amount must be greater than zero");
                return;
            }
        } catch (NumberFormatException ex) {
            showError("Please enter a valid amount");
            return;
        }

        if (source == btnDeposit) {
            balance += amount;
            tfBalance.setText(String.format("%.2f", balance));
            tfAmount.setText("");
            JOptionPane.showMessageDialog(this,
                    String.format("%.2f deposited successfully.\nNew balance: %.2f", amount, balance),
                    "Deposit", JOptionPane.INFORMATION_MESSAGE);
        } else if (source == btnWithdraw) {
            if (amount > balance) {
                showError("Insufficient balance! Available balance: " + String.format("%.2f", balance));
            } else {
                balance -= amount;
                tfBalance.setText(String.format("%.2f", balance));
                tfAmount.setText("");
                JOptionPane.showMessageDialog(this,
                        String.format("%.2f withdrawn successfully.\nNew balance: %.2f", amount, balance),
                        "Withdraw", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q10());
    }
}
