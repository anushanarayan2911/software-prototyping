import javax.swing.*;
import java.awt.*;


public class View {
    
    private JFrame frame;
    private JPanel panel1;

    public View() {
        frame = new JFrame();
        panel1 = new JPanel();

        frame.setTitle("Tasks");
        frame.setSize(500, 500);

        panel1.setSize(200, 200);
        panel1.setLayout(new GridLayout(4, 4));
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
