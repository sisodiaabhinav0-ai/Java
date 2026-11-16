import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Q9. Student Feedback Form - Swing
public class Q09 extends JFrame implements ActionListener {
    JTextField tfName = new JTextField(15);
    JTextField tfRoll = new JTextField(15);
    JTextField tfCourse = new JTextField(15);
    JRadioButton[] ratings = {
        new JRadioButton("Excellent"), new JRadioButton("Very Good"), new JRadioButton("Good"),
        new JRadioButton("Average"), new JRadioButton("Poor")
    };
    ButtonGroup ratingGroup = new ButtonGroup();
    JCheckBox[] feedback = {
        new JCheckBox("Teaching"), new JCheckBox("Laboratory"),
        new JCheckBox("Course Material"), new JCheckBox("Assignments")
    };
    JTextArea comments = new JTextArea(5, 30);
    JButton btnSubmit = new JButton("Submit");
    JButton btnReset = new JButton("Reset");

    Q09() {
        setTitle("Student Feedback Form");
        setLayout(new BorderLayout(10, 10));

        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));

        JPanel ratingPanel = new JPanel(new GridLayout(3, 2));
        for (JRadioButton rb : ratings) {
            ratingGroup.add(rb);
            ratingPanel.add(rb);
        }

        JPanel feedbackPanel = new JPanel(new GridLayout(2, 2));
        for (JCheckBox cb : feedback) {
            feedbackPanel.add(cb);
        }

        form.add(new JLabel("Student Name:"));
        form.add(tfName);
        form.add(new JLabel("Roll Number:"));
        form.add(tfRoll);
        form.add(new JLabel("Course:"));
        form.add(tfCourse);
        form.add(new JLabel("Rating:"));
        form.add(ratingPanel);
        form.add(new JLabel("Feedback about:"));
        form.add(feedbackPanel);

        JPanel commentPanel = new JPanel(new BorderLayout(5, 5));
        commentPanel.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));
        commentPanel.add(new JLabel("Comments:"), BorderLayout.NORTH);
        commentPanel.add(new JScrollPane(comments), BorderLayout.CENTER);

        JPanel buttons = new JPanel();
        buttons.add(btnSubmit);
        buttons.add(btnReset);

        add(form, BorderLayout.NORTH);
        add(commentPanel, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);

        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String rating = "Not selected";
            for (JRadioButton rb : ratings) {
                if (rb.isSelected()) {
                    rating = rb.getText();
                }
            }

            String about = "";
            for (JCheckBox cb : feedback) {
                if (cb.isSelected()) {
                    about += cb.getText() + ", ";
                }
            }
            if (about.isEmpty()) {
                about = "None";
            } else {
                about = about.substring(0, about.length() - 2);
            }

            JOptionPane.showMessageDialog(this,
                    "Name      : " + tfName.getText().trim() + "\n"
                    + "Roll No   : " + tfRoll.getText().trim() + "\n"
                    + "Course    : " + tfCourse.getText().trim() + "\n"
                    + "Rating    : " + rating + "\n"
                    + "Feedback  : " + about + "\n"
                    + "Comments  : " + comments.getText().trim(),
                    "Feedback Submitted", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnReset) {
            tfName.setText("");
            tfRoll.setText("");
            tfCourse.setText("");
            ratingGroup.clearSelection();
            for (JCheckBox cb : feedback) {
                cb.setSelected(false);
            }
            comments.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q09());
    }
}
