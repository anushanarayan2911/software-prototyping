import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;


public class View {
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel enterTaskLabel;
    private JTextField enterTaskTextField;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        enterTaskLabel = new JLabel("Enter task");
        enterTaskTextField = new JTextField();

        frame.setTitle("Tasks");
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        panel1.setSize(100, 50);
        BoxLayout boxLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(boxLayout);
        panel1.setLocation(210, 210);

        enterTaskLabel.setLocation(100, 0);

        Dimension size = new Dimension(100, 10);
        enterTaskTextField.setSize(size);
        enterTaskTextField.setBorder(null);

        panel1.add(enterTaskLabel);
        panel1.add(enterTaskTextField);

        frame.add(panel1);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
