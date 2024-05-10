import java.util.ArrayList;

public abstract class Vegetable extends Plant implements Eatable {
    private int Weight;
    public String chop(){
        return "chop the vegetable dont byte it";
    }
    public String eat(){
        return "you should eat vegetables cooked";
    }
    public int getWeight() {
        return Weight;
    }
    public void setWeight(int weight) {
        Weight = weight;
    }
    public abstract void setWatered(ArrayList<DayHr> Schedule);
    public String toString(){
        return "Vegetable";
    }
}
