import java.awt.*;
import java.awt.event.*;

// Q1. Student Registration Form - AWT
public class Q01 extends Frame implements ActionListener {
    TextField tfName = new TextField(20);
    TextField tfRoll = new TextField(20);
    TextField tfCourse = new TextField(20);
    CheckboxGroup genderGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", genderGroup, false);
    Checkbox female = new Checkbox("Female", genderGroup, false);
    Choice semester = new Choice();
    Button submit = new Button("Submit");
    Button reset = new Button("Reset");
    TextArea output = new TextArea(7, 40);

    Q01() {
        super("Student Registration Form");
        setLayout(new BorderLayout(10, 10));

        for (int i = 1; i <= 8; i++) {
            semester.add("Semester " + i);
        }

        Panel form = new Panel(new GridLayout(6, 2, 5, 8));
        form.add(new Label("Student Name:"));
        form.add(tfName);
        form.add(new Label("Roll Number:"));
        form.add(tfRoll);
        form.add(new Label("Course:"));
        form.add(tfCourse);
        form.add(new Label("Gender:"));
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);
        form.add(genderPanel);
        form.add(new Label("Semester:"));
        form.add(semester);
        form.add(submit);
        form.add(reset);

        output.setEditable(false);
        add(form, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setSize(450, 470);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            Checkbox selected = genderGroup.getSelectedCheckbox();
            String gender = (selected == null) ? "Not selected" : selected.getLabel();
            output.setText("---- Registration Details ----\n"
                    + "Name     : " + tfName.getText() + "\n"
                    + "Roll No  : " + tfRoll.getText() + "\n"
                    + "Course   : " + tfCourse.getText() + "\n"
                    + "Gender   : " + gender + "\n"
                    + "Semester : " + semester.getSelectedItem() + "\n");
        } else if (e.getSource() == reset) {
            tfName.setText("");
            tfRoll.setText("");
            tfCourse.setText("");
            genderGroup.setSelectedCheckbox(null);
            semester.select(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Q01();
    }
}
