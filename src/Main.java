import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zutaten def = new Zutaten(false, 0, false);

        Sorte black = new Sorte(def, "Black Coffee", false);
        Sorte capp = new Sorte(def, "Cappuccino", true);

        Behaelter small = new Behaelter("small", "glass");
        Behaelter grande = new Behaelter("grande", "glass");

        ArrayList<Sorte> SorteArr = new ArrayList<>();
        SorteArr.add(black);
        SorteArr.add(capp);

        ArrayList<Behaelter> BehaelterArr = new ArrayList<>();
        BehaelterArr.add(small);
        BehaelterArr.add(grande);

        Scanner s = new Scanner(System.in);
        System.out.println("Kaffeemaschine");
        System.out.print("\nWelche Sorte wollen Sie bestellen? (1: Schwarzer Kaffee, 2: Cappuccino): ");
        int sorte = s.nextInt();
        System.out.println("\nWelche Größe? (1: Small, 2: Grande): ");
        int size = s.nextInt();
        System.out.println("Wollen Sie Milch? ");
        char milk = s.next().charAt(0);
        if (milk == 'y') def.setMilk(true);

        Kaffee k = new Kaffee(SorteArr.get(sorte-1), BehaelterArr.get(size-1), 2);
        System.out.println("Hier ist Ihr "+k.getS().getName()+" in Größe "+k.getB().getSize()+". "+k.getPrice()+"€ bitte!");


    }
}
