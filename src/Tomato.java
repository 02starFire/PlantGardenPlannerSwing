import java.util.ArrayList;

public class Tomato extends Vegetable {
    private String kind;
    public Tomato(String kind){
        this.kind = kind;
    }
    public ArrayList<String> products(){
        ArrayList<String> products = new ArrayList<>();
        products.add("Tomato");
        products.add("Soup");
        products.add("Tomato Paste");
        products.add("Ketchup");
        return products;
    }
    @Override
    public DayHr getWatered() {
        return this.Schedule;
    }
    @Override
    public void setWatered(ArrayList<DayHr> schedule) {
        ArrayList<DayHr> customSchedule = new ArrayList<>();
        customSchedule.add(new DayHr("Monday", 9, 30));
        customSchedule.add(new DayHr("Wednesday", 9, 30));
        customSchedule.add(new DayHr("Friday", 9, 30));
    }

    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
