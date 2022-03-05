import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class View{
    
    // initialise variables
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
        //assign app variables
        frame1 = new JFrame();
        panel1 = new JPanel();
        lineSpace1 = new JLabel(" ");
        lineSpace2 = new JLabel(" ");
        enterTaskLabel = new JLabel("Enter Task");
        enterTaskTextField = new JTextField();
        enterTaskButton = new JButton("OK");
        imageIcon = new ImageIcon("images/crisps.png");
        imageLabel = new JLabel();

        // add basic info to app frame
        frame1.setTitle("Tasks");
        frame1.setSize(500, 500);
        frame1.setLayout(null);
        
        // add basic info to app panel
        panel1.setSize(100, 100);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setLocation(210, 210);
        
        enterTaskTextField.setBorder(null);
        
        // add items to app panel
        panel1.add(enterTaskLabel);
        panel1.add(lineSpace1);
        panel1.add(enterTaskTextField);
        panel1.add(lineSpace2);
        panel1.add(enterTaskButton);    

        //add app panel to app frame
        frame1.add(panel1);

        // assign device variables
        frame2 = new JFrame();
        panel2 = new JPanel();
        taskHeadingLabel = new JLabel();
        instructionLabel = new JLabel();
        yesButton = new JButton();
        noButton = new JButton();
        
        // add basic info to device frame
        frame2.setTitle("Device");
        frame2.setSize(500, 500);
        frame2.setLayout(null);

        // add basic info to device panel
        panel2.setSize(200, 200);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setLocation(210, 210);
        
        // add items to device panel
        panel2.add(taskHeadingLabel);
        panel2.add(imageLabel);
        panel2.add(instructionLabel);
        panel2.add(yesButton);
        panel2.add(noButton);

        // add device panel to device frame
        frame2.add(panel2);
    }

    public void displayScreen() {
        frame1.setVisible(true);
    }

    public void displayTask(String item, String action) {
        // display task in words
        taskHeadingLabel.setText("You have been given " + item + " to " + action);

        // display image
        String imageAddress = new String("images/" + item + ".png");
        imageIcon = new ImageIcon(imageAddress);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImage);
        imageLabel.setIcon(imageIcon);
        
        // refresh device panel
        panel2.revalidate();
        panel2.repaint();

        frame2.setVisible(true);
    }

    public void displayInstructions(ArrayList<String> instructions, int index) {
        if (index != instructions.size() - 1) {
            // display answer buttons
            instructionLabel.setText(instructions.get(index));
            yesButton.setText("yes");
            noButton.setText("no");
        
            panel2.revalidate();
            panel2.repaint();
        } else if(index == instructions.size() - 1) {
            // display last line of instructions, no more help needed
            instructionLabel.setText(instructions.get(index));

            panel2.remove(yesButton);
            panel2.remove(noButton);
            
            panel2.revalidate();
            panel2.repaint();
        }
        
    }

    public void displayFinalLine() {
        // display last line
        panel2.remove(yesButton);
        panel2.remove(noButton);

        instructionLabel.setText("Enjoy!");

        panel2.revalidate();
        panel2.repaint();

    }

    public void alertCarer() {
        // remove enter task sections
        panel1.remove(enterTaskLabel);
        panel1.remove(enterTaskTextField);
        panel1.remove(enterTaskButton);
        
        // show that user needs help
        JLabel helpNeededLabel = new JLabel("Help is required");
        panel1.add(helpNeededLabel);

        panel1.revalidate();
        panel1.repaint();
    }
}
