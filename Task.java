public class Task {
    private String title;
    private String description;
    private Date date;
    public Task(String title){
        this(title, null, null);
    }

    public Task(String title, String description){
        this(title, description, null);
    }

    public Task(String title, String description, Date date){
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public Date getDate(){
        return date;
    }
}
