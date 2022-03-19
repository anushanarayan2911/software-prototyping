import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    // create model and view
    private Model model;
    public View view;

    // create variables
    int index;
    ArrayList<String> instructions;

    public Controller(Model model, View view, Data data) {
        // initialise variables
        this.model = model;
        this.view = view;

        this.view.foodButton.addActionListener(this);
        this.view.OKFoodButton.addActionListener(this);
        this.view.yesButton.addActionListener(this);
        this.view.noButton.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.removeHomeScreen();
        if (e.getSource().equals(this.view.foodButton)) {
            this.view.showFoodOptions();
        } else if (e.getSource().equals(this.view.OKFoodButton)) {
            String foodItem = this.view.foodOptionsMenu.getSelectedItem().toString();
            String action = "eat";
            instructions = this.model.returnFoodInstructions(foodItem);
            index = 0;
            this.view.displayTask(foodItem, action);
            this.view.displayInstructions(instructions, index);
        } else if (e.getSource().equals(this.view.yesButton)) {
            if (index == 0) {
                // child does not need help, 
                this.view.displayFinalLine();
            } else if (index == 1) {
                // child has not started the activity, the device should take them through the task
                index += 1;
                this.view.displayInstructions(instructions, index);
            }
        } else if (e.getSource().equals(this.view.noButton)) {
            if (index == 1) {
                // child is stuck on a stage, and requires help
                this.view.alertCarer();
                
            } else {
                index += 1;
                this.view.displayInstructions(instructions, index);
            }
        }
    }
}
