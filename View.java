import javax.swing.*;

public class View {
    
    private JFrame frame;
    private JPanel panel1;
    private JLabel lineSpace1;
    private JLabel lineSpace2;
    private JLabel enterTaskLabel;
    public JTextField enterTaskTextField;
    public JButton enterTaskButton;
    
    public View() {
        frame = new JFrame();
        panel1 = new JPanel();
        lineSpace1 = new JLabel(" ");
        lineSpace2 = new JLabel(" ");
        enterTaskLabel = new JLabel("Enter task");
        enterTaskTextField = new JTextField();
        enterTaskButton = new JButton("OK");

        frame.setTitle("Tasks");
        frame.setSize(500, 500);
        frame.setLayout(null);
        
        panel1.setSize(100, 100);
        BoxLayout boxLayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(boxLayout);
        panel1.setLocation(210, 210);

        enterTaskLabel.setLocation(100, 0);

        enterTaskTextField.setBorder(null);

        panel1.add(enterTaskLabel);
        panel1.add(lineSpace1);
        panel1.add(enterTaskTextField);
        panel1.add(lineSpace2);
        panel1.add(enterTaskButton);

        frame.add(panel1);
    }

    public void displayScreen() {
        frame.setVisible(true);
    }
}
