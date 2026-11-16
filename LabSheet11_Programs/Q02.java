import java.awt.*;
import java.awt.event.*;

// Q2. Simple Calculator - AWT
public class Q02 extends Frame implements ActionListener {
    TextField tf1 = new TextField(12);
    TextField tf2 = new TextField(12);
    TextField tfResult = new TextField(25);
    Button add = new Button("Add (+)");
    Button sub = new Button("Subtract (-)");
    Button mul = new Button("Multiply (*)");
    Button div = new Button("Divide (/)");

    Q02() {
        super("Simple Calculator");
        setLayout(new GridLayout(4, 1, 5, 10));

        Panel p1 = new Panel();
        p1.add(new Label("First Number :"));
        p1.add(tf1);

        Panel p2 = new Panel();
        p2.add(new Label("Second Number:"));
        p2.add(tf2);

        Panel p3 = new Panel();
        p3.add(add);
        p3.add(sub);
        p3.add(mul);
        p3.add(div);

        Panel p4 = new Panel();
        p4.add(new Label("Result :"));
        tfResult.setEditable(false);
        p4.add(tfResult);

        add(p1);
        add(p2);
        add(p3);
        add(p4);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setSize(520, 280);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a, b;
        try {
            a = Double.parseDouble(tf1.getText().trim());
            b = Double.parseDouble(tf2.getText().trim());
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input");
            return;
        }

        Object source = e.getSource();
        if (source == add) {
            tfResult.setText(String.valueOf(a + b));
        } else if (source == sub) {
            tfResult.setText(String.valueOf(a - b));
        } else if (source == mul) {
            tfResult.setText(String.valueOf(a * b));
        } else if (source == div) {
            if (b == 0) {
                tfResult.setText("Cannot divide by zero");
            } else {
                tfResult.setText(String.valueOf(a / b));
            }
        }
    }

    public static void main(String[] args) {
        new Q02();
    }
}
