public class Citrus extends Fruit {
    private String cname;


    public Citrus(String cname) {
        this.cname = cname;
    }
    public String getCname() {
        return cname;
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
