import javax.swing.*;
import java.awt.*;


public class View {
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel label;
    private JLabel label2;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        label = new JLabel("hi");
        label2 = new JLabel("bye");

        frame.setTitle("Tasks");
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        panel1.setSize(100, 500);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setLocation(50, 50);

        panel1.add(label);
        panel1.add(label2);
        frame.add(panel1);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
