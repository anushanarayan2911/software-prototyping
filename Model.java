import java.util.ArrayList;
import java.util.HashMap;

public class Model {

    // create variables
    HashMap<String, ArrayList<String>> allTasks = new HashMap<String, ArrayList<String>>();
    ArrayList<String> foodTasks = new ArrayList<String>();
    ArrayList<String> clothesTasks = new ArrayList<String>();
    ArrayList<String> schoolTasks = new ArrayList<String>();
    ArrayList<String> houseTasks = new ArrayList<String>();

    public Model() {
        // add items to dictionaries
        allTasks.put("food", foodTasks);
        allTasks.put("clothes", clothesTasks);
        allTasks.put("school", schoolTasks);
        allTasks.put("house", houseTasks);
    }

    public String[] storeTask(String s){
        String action = "";
        if (s.contains("eat")) {
            // place item in food category
            foodTasks.add(s);
            allTasks.replace("food", foodTasks);
            action = "eat";
        } else if (s.contains("wear")) {
            // place item in clothes category
            clothesTasks.add(s);
            allTasks.replace("clothes", clothesTasks);
            action = "wear";
        } else if (s.contains("write")) {
            // place item in school category
            schoolTasks.add(s);
            allTasks.replace("school", schoolTasks);
            action = "write";
        } else if (s.contains("do")) {
            // place item in house category
            houseTasks.add(s);
            allTasks.replace("house", houseTasks);
            action = "do";
        }

        int startIndex = s.indexOf(" ") + 1;

        String item = s.substring(startIndex, s.length());
        String[] toReturn = new String[2];
        toReturn[0] = item;
        toReturn[1] = action;
        
        return(toReturn);
    }
}
