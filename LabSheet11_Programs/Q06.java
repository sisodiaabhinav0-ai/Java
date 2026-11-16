import java.awt.*;
import java.awt.event.*;

// Q6. Employee Registration Form - AWT
public class Q06 extends Frame implements ActionListener {
    TextField tfId = new TextField(20);
    TextField tfName = new TextField(20);
    TextField tfDesignation = new TextField(20);
    TextField tfSalary = new TextField(20);
    Choice department = new Choice();          // department selection
    CheckboxGroup genderGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", genderGroup, false);
    Checkbox female = new Checkbox("Female", genderGroup, false);
    Checkbox other = new Checkbox("Other", genderGroup, false);
    Button submit = new Button("Submit");
    Button clear = new Button("Clear");
    TextArea output = new TextArea(7, 40);

    Q06() {
        super("Employee Registration Form");
        setLayout(new BorderLayout(10, 10));

        department.add("Computer Science");
        department.add("Human Resources");
        department.add("Finance");
        department.add("Marketing");
        department.add("Operations");

        Panel form = new Panel(new GridLayout(7, 2, 5, 8));
        form.add(new Label("Employee ID:"));
        form.add(tfId);
        form.add(new Label("Name:"));
        form.add(tfName);
        form.add(new Label("Designation:"));
        form.add(tfDesignation);
        form.add(new Label("Salary:"));
        form.add(tfSalary);
        form.add(new Label("Department:"));
        form.add(department);
        form.add(new Label("Gender:"));
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        form.add(genderPanel);
        form.add(submit);
        form.add(clear);

        output.setEditable(false);
        add(form, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setSize(470, 520);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            Checkbox selected = genderGroup.getSelectedCheckbox();
            String gender = (selected == null) ? "Not selected" : selected.getLabel();
            output.setText("---- Employee Details ----\n"
                    + "Employee ID : " + tfId.getText() + "\n"
                    + "Name        : " + tfName.getText() + "\n"
                    + "Designation : " + tfDesignation.getText() + "\n"
                    + "Salary      : " + tfSalary.getText() + "\n"
                    + "Department  : " + department.getSelectedItem() + "\n"
                    + "Gender      : " + gender + "\n");
        } else if (e.getSource() == clear) {
            tfId.setText("");
            tfName.setText("");
            tfDesignation.setText("");
            tfSalary.setText("");
            department.select(0);
            genderGroup.setSelectedCheckbox(null);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Q06();
    }
}
