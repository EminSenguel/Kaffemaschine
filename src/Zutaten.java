public class Zutaten {
    private boolean milk;
    private int strength;
    private boolean sugar;

    public Zutaten(boolean milk, int strength, boolean sugar) {
        this.milk = milk;
        this.strength = strength;
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }
}
