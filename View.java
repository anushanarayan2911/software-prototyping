import java.awt.*;
import javax.swing.*;

public class View{
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel lineSpace1;
    private JLabel lineSpace2;
    private JLabel enterTaskLabel;
    public JTextField enterTaskTextField;
    public JButton enterTaskButton;

    ImageIcon imageIcon;
    private JLabel imageLabel;
    
    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        lineSpace1 = new JLabel(" ");
        lineSpace2 = new JLabel(" ");
        enterTaskLabel = new JLabel("Enter Task");
        enterTaskTextField = new JTextField();
        enterTaskButton = new JButton("OK");
        imageIcon = new ImageIcon("images/crisps.png");
        imageLabel = new JLabel();

        frame.setTitle("Tasks");
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        panel1.setSize(100, 200);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setLocation(210, 210);
        
        enterTaskTextField.setBorder(null);
        
        panel1.add(enterTaskLabel);
        panel1.add(lineSpace1);
        panel1.add(enterTaskTextField);
        panel1.add(lineSpace2);
        panel1.add(enterTaskButton);    
        panel1.add(imageLabel);

        frame.add(panel1);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }

    public void displayImage(String imageAddress) {
        imageIcon = new ImageIcon(imageAddress);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImage);
        imageLabel.setIcon(imageIcon);
        
        panel1.revalidate();
        panel1.repaint();
    }
}
