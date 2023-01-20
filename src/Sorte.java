public class Sorte {
    private Zutaten z;
    private String name;
    private boolean withMilk;

    public Sorte(Zutaten z, String name, boolean withMilk) {
        this.z = z;
        this.name = name;
        this.withMilk = withMilk;
    }

    public Zutaten getZ() {
        return z;
    }

    public void setZ(Zutaten z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }
}
