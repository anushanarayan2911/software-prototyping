import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    private Model model;
    public View view;
    private Data data;

    public Controller(Model model, View view, Data data) {
        this.model = model;
        this.view = view;
        this.data = data;

        this.view.enterTaskButton.addActionListener(this);
        this.view.yesButton.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(this.view.enterTaskButton);
        Object actionSource = e.getSource();

        if (actionSource.equals(this.view.enterTaskButton)) {
            
            String task = this.view.enterTaskTextField.getText();
            String imageToDisplay = this.model.storeTask(task)[0];
            String actionToDisplay = this.model.storeTask(task)[1];
            this.view.displayTask(imageToDisplay, actionToDisplay);

            String instructionsKey = actionToDisplay + " " + imageToDisplay;
            ArrayList<String> instructions = this.data.foodInstructions.get(instructionsKey);
            this.view.displayInstructions(instructions);
            
        } else if (actionSource.equals(this.view.yesButton)) {
            this.view.displayFinalLine();
        }
    }
}
