import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    private Model model;
    public View view;
    private Data data;
    int index;
    ArrayList<String> instructions;

    public Controller(Model model, View view, Data data) {
        this.model = model;
        this.view = view;
        this.data = data;

        this.view.enterTaskButton.addActionListener(this);
        this.view.yesButton.addActionListener(this);
        this.view.noButton.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object actionSource = e.getSource();
        
        if (actionSource.equals(this.view.enterTaskButton)) {
            
            String task = this.view.enterTaskTextField.getText();
            String imageToDisplay = this.model.storeTask(task)[0];
            String actionToDisplay = this.model.storeTask(task)[1];
            this.view.displayTask(imageToDisplay, actionToDisplay);

            String instructionsKey = actionToDisplay + " " + imageToDisplay;
            instructions = this.data.foodInstructions.get(instructionsKey);
            index = 0;
            this.view.displayInstructions(instructions, index);

            this.view.enterTaskTextField.setText("");
            
        } else if (actionSource.equals(this.view.yesButton)) {
            if (index == 0) {
                this.view.displayFinalLine();
            } else if (index == 1) {
                index += 1;
                this.view.displayInstructions(instructions, index);
            }
        } else if (actionSource.equals(this.view.noButton)) {
            if (index == instructions.size() - 2) {
                this.view.alertCarer();
            } else {
                index += 1;
                this.view.displayInstructions(instructions, index);
            }
            
        }
    }
}
