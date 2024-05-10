public abstract class Fruit extends Plant implements Eatable {
    private int price;
    public void SetPrice(int price) {
        this.price = price;
    }
    public int GetPrice() {
        return this.price;
    }
    public String chop(){
        return "don’t chop the fruit byte it";
    }
    public String eat(){
        return "“you should eat fruits raw";
    }
}
