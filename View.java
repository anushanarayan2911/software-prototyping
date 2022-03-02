import java.awt.*;
import javax.swing.*;
//5import java.awt.imageLabel.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class View{
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel lineSpace1;
    private JLabel lineSpace2;
    private JLabel enterTaskLabel;
    public JTextField enterTaskTextField;
    public JButton enterTaskButton;

    //private ImageIcon imageLabel;;
    private JLabel imageLabel;
    
    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        imageLabel = new JLabel();

        frame.setTitle("Tasks");
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        panel1.setSize(100, 300);
        BoxLayout boxLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(boxLayout);
        panel1.setLocation(210, 210);
    
        ImageIcon icon = new ImageIcon("images/crisps.png");
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        imageLabel.setIcon(icon);

        panel1.add(imageLabel);

        frame.add(panel1);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
