import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    // create model and view
    private Model model;
    public View view;
    
    // create large data set
    private Data data; 

    // create variables
    int index;
    ArrayList<String> instructions;

    public Controller(Model model, View view, Data data) {
        // initialise variables
        this.model = model;
        this.view = view;
        this.data = data;

        this.view.foodButton.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.removeHomeScreen();
        System.out.println("hi");
        if (e.getSource().equals(this.view.foodButton)) {
            this.view.showFoodOptions();
        }
        
    }
}
