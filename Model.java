import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

public class Model {

    //ArrayList<String> tasksList = new ArrayList<String>();
    HashMap<String, ArrayList<String>> allTasks = new HashMap<String, ArrayList<String>>();
    ArrayList<String> foodTasks = new ArrayList<String>();
    ArrayList<String> clothesTasks = new ArrayList<String>();
    ArrayList<String> schoolTasks = new ArrayList<String>();
    ArrayList<String> houseTasks = new ArrayList<String>();

    HashMap<String, String> imagesCollection = new HashMap<String, String>();

    public Model() {
        allTasks.put("food", foodTasks);
        allTasks.put("clothes", clothesTasks);
        allTasks.put("school", schoolTasks);
        allTasks.put("house", houseTasks);

        imagesCollection.put("crisps", "images/crisps.png");
        imagesCollection.put("apple", "images/apple.png");
    }

    public String storeTask(String s){
        if (s.contains("eat")) {
            foodTasks.add(s);
            allTasks.replace("food", foodTasks);
        } else if (s.contains("wear")) {
            clothesTasks.add(s);
            allTasks.replace("clothes", clothesTasks);
        } else if (s.contains("write")) {
            schoolTasks.add(s);
            allTasks.replace("school", schoolTasks);
        } else if (s.contains("do")) {
            houseTasks.add(s);
            allTasks.replace("house", houseTasks);
        }

        int startIndex = s.indexOf(" ") + 1;

        String item = s.substring(startIndex, s.length());
        return(item);
    }

    public String getImageAddress(String s) {
        String imageAddress = imagesCollection.get(s);

        return(imageAddress);
    }
}
