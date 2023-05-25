public class Date {
    private int year;
    private int month;
    private int day;
    public Date(){
        this(0,0,0);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }
}
