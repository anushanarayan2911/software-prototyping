
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        //this.view.enterTaskButton.addActionListener(this);
    }

    public void displayScreen() {
        this.view.displayScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String task = this.view.enterTaskTextField.getText();
        this.model.storeTask(task);
        //this.view.displayImage();
    }   
}
