public class Kaffee {
    private Sorte s;
    private Behaelter b;
    private double price;

    public Kaffee(Sorte s, Behaelter b, double price){
        this.s = s;
        this.b = b;
        this.price = price;
    }

    public Sorte getS() {
        return s;
    }

    public void setS(Sorte s) {
        this.s = s;
    }

    public Behaelter getB() {
        return b;
    }

    public void setB(Behaelter b) {
        this.b = b;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
