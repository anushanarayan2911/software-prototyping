import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Model {

    private Data data;

    public HashMap<String, ArrayList<String>> food;
    public HashMap<String, ArrayList<String>> foodInstructions;

    public Model() {
        foodInstructions = new HashMap<String, ArrayList<String>>();
        ArrayList<String> crispsInstruction = new ArrayList<>(Arrays.asList("Are you eating the crisps?", "Is the packet open?", "You can eat the crisps"));
        foodInstructions.put("crisps", crispsInstruction);
        food = new HashMap<String, ArrayList<String>>();
        food.put("crisps", foodInstructions.get("crisps"));
    }

    
    
}
