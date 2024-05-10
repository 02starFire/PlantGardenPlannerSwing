import java.util.ArrayList;

public class DayHr {
    String day;
    int hour;
    int duration;

    DayHr(String day, int hour, int duration) {
        this.day = day;
        this.hour = hour;
        this.duration = duration;
    }
    public String toString(){
        return day + "," + hour + "," + duration;
    }
}
