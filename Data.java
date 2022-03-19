import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Data {

    public HashMap<String, ArrayList<String>> foodInstructions;

    public Data() {
        foodInstructions = new HashMap<String, ArrayList<String>>();
        ArrayList<String> crispsInstruction = new ArrayList<>(Arrays.asList("Are you eating the crisps?", "Is the packet open?", "You can eat the crisps"));
        foodInstructions.put("crisps", crispsInstruction);
    }
}
