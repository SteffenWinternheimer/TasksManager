import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> taskList;

    public TaskList() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task t) {
        taskList.add(t);
    }

    public String toString() {
        String list = "";
        for (Task t : taskList) {
            list += "[" + t.getTitle() + "],[" + t.getDescription() + "],[" + t.getDate().toString() + "]\n";
        }
        return list;
    }
}
