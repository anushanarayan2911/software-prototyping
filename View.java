import javax.swing.*;
import java.awt.*;


public class View {
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel label;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        label = new JLabel("hi");

        frame.setTitle("Tasks");
        frame.setSize(500, 500);

        frame.add(label);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
