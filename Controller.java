import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    private Model model;
    private View view;
    private Data data;

    public Controller(Model model, View view, Data data) {
        this.model = model;
        this.view = view;
        this.data = data;

        this.view.enterTaskButton.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String task = this.view.enterTaskTextField.getText();
        String imageToDisplay = this.model.storeTask(task)[0];
        String actionToDisplay = this.model.storeTask(task)[1];
        this.view.displayTask(imageToDisplay, actionToDisplay);

        String instructionsKey = actionToDisplay + " " + imageToDisplay;
        ArrayList<String> instructions = this.data.foodInstructions.get(instructionsKey);
        this.view.displayInstructions(instructions);
    }   
}
