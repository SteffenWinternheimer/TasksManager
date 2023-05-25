public class TestMain {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Wäsche waschen", "Hier wird hände gewaschen", new Date(25,5,2023)));
        FileManager fileManager = new FileManager();
        fileManager.saveFile(args[0], taskList.toString());
    }
}
