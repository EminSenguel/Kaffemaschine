import java.util.Scanner;

import static java.lang.System.out;

public class Inhaltstabelle {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);


        out.println("Bitte wähle eines der Folgenden Produkte: " + "\n" + "Drücke '1' - Cappucino " + "\n" +
                "Drücke '1' - Kaffe schwarz ");

        int selection = z.nextInt();

        switch (selection) {
            case 1:
                // get balance
                out.println("Zahlenduell");

                break;
            case 2:
                out.println("Zahlenraten");



                break;


        }
}
