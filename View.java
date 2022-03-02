import javax.swing.*;
import java.awt.*;


public class View {
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel enterTaskLabel;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        enterTaskLabel = new JLabel("Enter task");

        frame.setTitle("Tasks");
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        panel1.setSize(500, 500);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setLocation(210, 100);

        panel1.add(enterTaskLabel);

        frame.add(panel1);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
