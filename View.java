import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class View{
    
    private JFrame frame1;
    private JPanel panel1;
    private JLabel lineSpace1;
    private JLabel lineSpace2;
    private JLabel enterTaskLabel;
    public JTextField enterTaskTextField;
    public JButton enterTaskButton;

    private JFrame frame2;
    private JPanel panel2;
    ImageIcon imageIcon;
    private JLabel imageLabel;
    private JLabel taskHeadingLabel;

    private JLabel instructionLabel;
    public JButton yesButton;
    public JButton noButton;
    
    public View() {
        frame1 = new JFrame();
        panel1 = new JPanel();
        lineSpace1 = new JLabel(" ");
        lineSpace2 = new JLabel(" ");
        enterTaskLabel = new JLabel("Enter Task");
        enterTaskTextField = new JTextField();
        enterTaskButton = new JButton("OK");
        imageIcon = new ImageIcon("images/crisps.png");
        imageLabel = new JLabel();

        frame1.setTitle("Tasks");
        frame1.setSize(500, 500);
        frame1.setLayout(null);
        
        panel1.setSize(100, 100);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setLocation(210, 210);
        
        enterTaskTextField.setBorder(null);
        
        panel1.add(enterTaskLabel);
        panel1.add(lineSpace1);
        panel1.add(enterTaskTextField);
        panel1.add(lineSpace2);
        panel1.add(enterTaskButton);    

        frame1.add(panel1);

        frame2 = new JFrame();
        panel2 = new JPanel();
        taskHeadingLabel = new JLabel();
        instructionLabel = new JLabel();
        yesButton = new JButton();
        noButton = new JButton();
        
        frame2.setTitle("Device");
        frame2.setSize(500, 500);
        frame2.setLayout(null);

        panel2.setSize(200, 200);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setLocation(210, 210);
        
        panel2.add(taskHeadingLabel);
        panel2.add(imageLabel);
        panel2.add(instructionLabel);
        panel2.add(yesButton);
        panel2.add(noButton);

        frame2.add(panel2);
    }

    public void displayScreen() {
        frame1.setVisible(true);
    }

    public void displayTask(String item, String action) {
        taskHeadingLabel.setText("You have been given " + item + " to " + action);

        String imageAddress = new String("images/" + item + ".png");
        imageIcon = new ImageIcon(imageAddress);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImage);
        imageLabel.setIcon(imageIcon);
        
        panel2.revalidate();
        panel2.repaint();

        frame2.setVisible(true);
    }

    public void displayInstructions(ArrayList<String> instructions, int index) {
        if (index != instructions.size() - 1) {
            instructionLabel.setText(instructions.get(index));
            yesButton.setText("yes");
            noButton.setText("no");
        
            panel2.revalidate();
            panel2.repaint();
        } else if(index == instructions.size() - 1) {
            instructionLabel.setText(instructions.get(index));

            panel2.remove(yesButton);
            panel2.remove(noButton);
            
            panel2.revalidate();
            panel2.repaint();
        }
        
    }

    public void displayFinalLine() {
        panel2.remove(yesButton);
        panel2.remove(noButton);

        instructionLabel.setText("Enjoy!");

        panel2.revalidate();
        panel2.repaint();

    }
}
