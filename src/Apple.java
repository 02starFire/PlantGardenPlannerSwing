public class Apple extends Fruit{
    private String aname;
    public Apple(String aname) {
        this.aname = aname;
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
