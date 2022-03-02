import java.util.ArrayList;

public class Model {

    ArrayList<String> tasksList = new ArrayList<String>();

    public void storeTask(String s){
        tasksList.add(s);

        System.out.println(tasksList.size());
    }
}
