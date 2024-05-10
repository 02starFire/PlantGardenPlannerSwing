public class Flower extends Plant {

    private String name;
    private int smellIntensity;
    Flower(String name){
        this.name = name;
    }
    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    public String getSmellIntensity() {
        return switch (smellIntensity) {
            case 1 -> "very weak";
            case 2 -> "weak";
            case 3 -> "mid";
            case 4 -> "strong";
            case 5 -> "very strong";
            default -> "";
        };
    }
    public void setSmellIntensity(int smellIntensity) {
        this.smellIntensity = smellIntensity;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "Flower";
    }
}
