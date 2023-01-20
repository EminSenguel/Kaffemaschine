import java.util.Scanner;

import static java.lang.System.out;

public class Spiel {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);


        out.println("Bitte wähle eines der Folgenden Spiele: " + "\n" + "Drücke '1' für Spiel -Wer muss zahlen? (2 Spieler)" + "\n" +
                "Drücke '2' für Spiel -Errate deinen Kaffee (1 Spieler)");

        int selection = z.nextInt();

        switch (selection) {
            case 1:
                // get balance
                out.println("Zahlenduell");
                System.out.println("Willkommen beim Ratespiel Wer muss zahlen?");

                Scanner s = new Scanner(System.in);
                int Zahleins;
                System.out.println("Spieler eins Bitte deinen Tipp eingeben: ");
                Zahleins = s.nextInt();


                int Zahlzwei;
                System.out.println("Spieler zwei Bitte deinen Tipp eingeben: ");
                Zahlzwei = s.nextInt();

                int Randomzahl = (int) (Math.random()*100);
                System.out.println("Hier entsteht die Random Zahl: "+ Randomzahl);
                int Differenz1 = Math.abs(Randomzahl-Zahleins);
                int Differenz2 = Math.abs(Randomzahl-Zahlzwei);

                if ( Differenz1 > Differenz2 ) {
                    System.out.println("Spieler zwei hat gewonnen ");
                }

                else {System.out.println("Spieler eins hat gewonnen ");}

                s.close();

                break;
            case 2:
                out.println("Zahlenraten");

                int Randomzahl1 = (int) (Math.random()*100);


                boolean win = false;
                int i=0;
                boolean Weiterspielen = false;



                while (!win) {

                    Scanner t = new Scanner(System.in);
                    int l;
                    System.out.println("Zahl zwischen 1 und 100 eingeben");
                    l = t.nextInt();

                    if (Randomzahl1 == l) {
                        System.out.println("Sie haben  "+ i + " Versuche gebraucht und damit einen Kaffee gewonnen. Herzlichen Glückwunsch");
                        win=true;

                    }

                    else if (Randomzahl1<l)
                    {System.out.println("Probiere es mit einer kleineren Zahl");
                        i++;}


                    else if (Randomzahl1> l)
                    {System.out.println("Probiere es mit einer größeren Zahl");i++;}



                    if (i < 3) {
                        System.out.println("Viel Spaß bei einer weiteren Runde");
                        win=false;

                    }

                    else if (i == 3)
                    {System.out.println("Sie haben ihre gesamten Versuche verbraucht und leider keinen Kaffee erraten. Bitte zahlen sie jetzt am Automaten und genießen sie ihren Kaffee  ");
                        win= true;}

                }


                break;


        }


    }}



