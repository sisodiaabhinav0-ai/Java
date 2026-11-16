import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Q4. Student Marksheet GUI - Swing
public class Q04 extends JFrame implements ActionListener {
    String[] subjects = {"English", "Mathematics", "Java", "DBMS", "Computer Networks"};
    JTextField[] marks = new JTextField[5];
    JButton btnCalc = new JButton("Calculate Result");
    JTextArea result = new JTextArea(7, 25);

    Q04() {
        setTitle("Student Marksheet");
        setLayout(new BorderLayout(10, 10));

        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));
        for (int i = 0; i < 5; i++) {
            marks[i] = new JTextField();
            form.add(new JLabel(subjects[i] + " (out of 100):"));
            form.add(marks[i]);
        }

        JPanel bottom = new JPanel(new BorderLayout(5, 5));
        bottom.setBorder(BorderFactory.createEmptyBorder(5, 15, 15, 15));
        result.setEditable(false);
        bottom.add(btnCalc, BorderLayout.NORTH);
        bottom.add(new JScrollPane(result), BorderLayout.CENTER);

        add(form, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        btnCalc.addActionListener(this);

        setSize(420, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int total = 0;
            boolean passedAll = true;
            for (int i = 0; i < 5; i++) {
                int m = Integer.parseInt(marks[i].getText().trim());
                if (m < 0 || m > 100) {
                    throw new IllegalArgumentException("Marks out of range");
                }
                total += m;
                if (m < 40) {
                    passedAll = false;
                }
            }

            double percentage = total / 5.0;
            String grade;
            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else if (percentage >= 40) grade = "E";
            else grade = "F";

            result.setText("Total      : " + total + " / 500\n"
                    + String.format("Percentage : %.2f%%\n", percentage)
                    + "Grade      : " + grade + "\n"
                    + "Status     : " + (passedAll ? "PASS" : "FAIL") + "\n");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid marks (0 to 100) for all subjects",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q04());
    }
}
