import javax.swing.*;
import java.awt.*;

public class jframe extends JFrame {

    public jframe() {
        // Frame title
        setTitle("Student Form (Lambda Example)");

        // Create components
        JLabel lblName = new JLabel("Name:");
        JLabel lblRoll = new JLabel("Roll No:");
        JTextField txtName = new JTextField(15);
        JTextField txtRoll = new JTextField(15);
        JButton btnSubmit = new JButton("Submit");

        // Layout for alignment
        setLayout(new GridLayout(3, 2, 10, 10));

        // Add components
        add(lblName);
        add(txtName);
        add(lblRoll);
        add(txtRoll);
        add(new JLabel()); // empty cell for spacing
        add(btnSubmit);

        // 🧠 Event Handling using Lambda Expression
        btnSubmit.addActionListener(e -> {
            String name = txtName.getText();
            String roll = txtRoll.getText();
            JOptionPane.showMessageDialog(this,
                    "Student Name: " + name + "\nRoll No: " + roll);
        });

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jframe();
    }
}
