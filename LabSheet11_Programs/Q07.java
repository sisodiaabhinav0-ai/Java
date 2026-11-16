import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Q7. Temperature Converter - Swing
public class Q07 extends JFrame implements ActionListener {
    JTextField tfTemp = new JTextField(12);
    JRadioButton rbCtoF = new JRadioButton("Celsius to Fahrenheit", true);
    JRadioButton rbFtoC = new JRadioButton("Fahrenheit to Celsius");
    ButtonGroup group = new ButtonGroup();
    JButton btnConvert = new JButton("Convert");
    JButton btnClear = new JButton("Clear");
    JLabel lblResult = new JLabel("Result: ");

    Q07() {
        setTitle("Temperature Converter");
        setLayout(new GridLayout(5, 1, 5, 10));
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        group.add(rbCtoF);
        group.add(rbFtoC);

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Temperature:"));
        p1.add(tfTemp);

        JPanel p4 = new JPanel();
        p4.add(btnConvert);
        p4.add(btnClear);

        add(p1);
        add(rbCtoF);
        add(rbFtoC);
        add(p4);
        add(lblResult);

        btnConvert.addActionListener(this);
        btnClear.addActionListener(this);

        setSize(380, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConvert) {
            try {
                double t = Double.parseDouble(tfTemp.getText().trim());
                if (rbCtoF.isSelected()) {
                    double f = (t * 9 / 5) + 32;
                    lblResult.setText(String.format("Result: %.2f C = %.2f F", t, f));
                } else {
                    double c = (t - 32) * 5 / 9;
                    lblResult.setText(String.format("Result: %.2f F = %.2f C", t, c));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid number.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnClear) {
            tfTemp.setText("");
            lblResult.setText("Result: ");
            rbCtoF.setSelected(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q07());
    }
}
