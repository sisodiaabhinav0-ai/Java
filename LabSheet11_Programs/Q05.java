import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Q5. Course Selection Form - Swing
public class Q05 extends JFrame implements ActionListener {
    JTextField tfName = new JTextField(15);
    JComboBox<String> cbCourse = new JComboBox<>(new String[]{"BCA", "MCA", "B.Tech", "MBA", "B.Sc"});
    JRadioButton rbMale = new JRadioButton("Male");
    JRadioButton rbFemale = new JRadioButton("Female");
    JRadioButton rbOther = new JRadioButton("Other");
    ButtonGroup genderGroup = new ButtonGroup();
    JCheckBox[] subjects = {
        new JCheckBox("Java"), new JCheckBox("Python"), new JCheckBox("DBMS"),
        new JCheckBox("Networks"), new JCheckBox("Web Technology")
    };
    JButton btnSubmit = new JButton("Submit");
    JButton btnReset = new JButton("Reset");

    Q05() {
        setTitle("Course Selection Form");
        setLayout(new GridLayout(5, 2, 10, 10));
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        genderGroup.add(rbOther);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        genderPanel.add(rbOther);

        JPanel subjectPanel = new JPanel(new GridLayout(3, 2));
        for (JCheckBox cb : subjects) {
            subjectPanel.add(cb);
        }

        add(new JLabel("Student Name:"));
        add(tfName);
        add(new JLabel("Course:"));
        add(cbCourse);
        add(new JLabel("Gender:"));
        add(genderPanel);
        add(new JLabel("Subjects:"));
        add(subjectPanel);
        add(btnSubmit);
        add(btnReset);

        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);

        setSize(480, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            if (tfName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter student name",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String gender = "Not selected";
            if (rbMale.isSelected()) gender = "Male";
            else if (rbFemale.isSelected()) gender = "Female";
            else if (rbOther.isSelected()) gender = "Other";

            String selectedSubjects = "";
            for (JCheckBox cb : subjects) {
                if (cb.isSelected()) {
                    selectedSubjects += cb.getText() + ", ";
                }
            }
            if (selectedSubjects.isEmpty()) {
                selectedSubjects = "None";
            } else {
                selectedSubjects = selectedSubjects.substring(0, selectedSubjects.length() - 2);
            }

            JOptionPane.showMessageDialog(this,
                    "Name     : " + tfName.getText().trim() + "\n"
                    + "Course   : " + cbCourse.getSelectedItem() + "\n"
                    + "Gender   : " + gender + "\n"
                    + "Subjects : " + selectedSubjects,
                    "Submitted Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnReset) {
            tfName.setText("");
            cbCourse.setSelectedIndex(0);
            genderGroup.clearSelection();
            for (JCheckBox cb : subjects) {
                cb.setSelected(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q05());
    }
}
