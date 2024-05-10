import java.util.ArrayList;

abstract class Plant {
    public DayHr Schedule = new DayHr("Monday", 10, 1);
    public String color;
    public DayHr getWatered(){
        return this.Schedule;
    }
    public void setWatered(DayHr watered){
        this.Schedule = watered;
    }
    public abstract String getColor();
    public abstract void setColor(String color);
    public String toString(){
        return "Plant";
    }
}
