import javax.swing.*;

public class View{
    
    // initialise variables
    private JFrame frame1;
    private JPanel panel1;

    public JButton foodButton;
    public JButton clothesButton;
    public JButton schoolButton;
    public JButton houseButton;

    private String[] foodOptions = {"apple", "crisps", "cereal bar", "juice box"};
    public JComboBox<String> foodOptionsMenu; 

    public JButton OKFoodButton;
    
    public View() {
        //assign app variables
        frame1 = new JFrame();
        panel1 = new JPanel();

        foodButton = new JButton("food");
        clothesButton = new JButton("clothes");
        schoolButton = new JButton("school");
        houseButton = new JButton("house");

        foodOptionsMenu = new JComboBox<>(foodOptions);

        OKFoodButton = new JButton("OK");

        // add basic info to app frame
        frame1.setTitle("Tasks");
        frame1.setSize(500, 500);
        frame1.setLayout(null);
        
        // add basic info to app panel
        panel1.setSize(100, 100);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setLocation(210, 210);
        
        // add items to app panel
        panel1.add(foodButton);
        panel1.add(clothesButton);
        panel1.add(schoolButton);
        panel1.add(houseButton);

        //add app panel to app frame
        frame1.add(panel1);
    }

    public void displayScreen() {
        frame1.setVisible(true);
    }

    public void removeHomeScreen() {
        panel1.remove(foodButton);
        panel1.remove(clothesButton);
        panel1.remove(schoolButton);
        panel1.remove(houseButton);
        panel1.revalidate();
        panel1.repaint();
    }

    public void showFoodOptions() {
        panel1.add(foodOptionsMenu);
        panel1.add(OKFoodButton);
        panel1.revalidate();
        panel1.repaint();
    }

   
}
