 // Kaffesorte schwarz = new Kaffeesorte();
        // eingabe (1 = asdasd)
        //Eingabe Stärke
        // Array[1].getZutaten.setStärke(10);
        // Zutaten z1 = Zutaten(......);
        // Kaffesorten(z1)


     import java.util.*;

     public class Main
     {
         public static Scanner scanner = new Scanner (System.in);                    // Einbinden der Scanner-Funktion

         public static final String Produkt1 = "Kleinen Kaffee";                     // Variablen-Konstante: Kleinen Kaffee (Ausgabe)
         public static final String Produkt2 = "Großen Kaffee";                      // Variablen-Konstante: Großen Kaffee (Ausgabe)
         public static final String Milch1 = "mit Milch";                            // Variablen-Konstante: mit Milch (Ausgabe)
         public static final String Milch2 = "ohne Milch";                           // Variablen-Konstante: ohne Milch (Ausgabe)
         public static final double Produkt10 = 50;                                  // Variablen-Konstante: Kleiner Kaffee 50g (Berechnung)
         public static final double Produkt20 = 100;                                 // Variablen-Konstante: Großer Kaffee 100g (Berechnung)
         public static final double Milch10 = 10;                                    // Variablen-Konstante: Milch-Kleiner Kaffee 10g (Berechnung)
         public static final double Milch20 = 20;                                    // Variablen-Konstante: Milch-Großer Kaffee 20g ( Berechnung)
         public static final double Zucker = 2;                                      // Variablen-Konstante: Zucker pro Stück 2g ( Berechnung)
         public static final double Kaffeepulver_gesamt = 1000;                      // Variablen-Konstante: Kaffeepulver 1kg (Start)
         public static final double Milchpulver_gesamt = 1000;                       // Variablen-Konstante: Milchpulver 1kg (Start)
         public static final double Zucker_gesamt = 1000;                            // Variablen-Konstante: Zucker 1kg (Start)

         ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         public static void main (String[] args)                                  // Anfang des Hauptprogramm
         {

       /*     double mp_gesamt = Milchpulver_gesamt;
            double zk_gesamt = Zucker_gesamt;   */

             String repeat = "n";                                                // Abbruchbedingung der do-while-Schleife
             do                                                                  // Beginn der do-while-Schleife (Neustart)
             {
                 System.out.println ("Willkommen. Heute im Angebot:\n" );            // Begrüßung

                 System.out.println ("1: Kleiner Kaffee" );                          // Ausgabe "Kleiner Kaffee"
                 System.out.println ("2: Großer Kaffee\n" );                         // Ausgabe "Großer Kaffee"
                 System.out.println ("Bitte wählen Sie ein Produkt:" );              // Eingabe der Größe durch Benutzer
                 int Produkt = scanner.nextInt ();                                   // Scan der Größe
                 String AdG = Auswahl_der_Groeße (Produkt);                          // Aufruf der Funktion "Auswahl_der_Größe"
                 double AdGB = Auswahl_der_Groeße_Berechnung (Produkt);              // Aufruf der Funktion "Auswahl_der_Größe_Berechnung"

                 System.out.println ("Wie möchten Sie Ihren Kaffee:" );              // Ausgabe Abfrage ob Schwarz oder Weiß
                 System.out.println ("1: Schwarz" );                                 // Ausgabe "Schwarz"
                 System.out.println ("2: Weiß" );                                    // Ausgabe "Weiß"
                 System.out.println ("Bitte wählen Sie:" );                          // Wählen
                 int Kaffee = scanner.nextInt ();                                    // Scan ob SW oder WS
                 String Sw = Schwarz_Weiß (Kaffee);                                  // Aufruf der Funktion "Schwarz_Weiß"
                 double SwB = Auswahl_der_Groeße_Berechnung (Kaffee);                // Aufruf der Funktion "Auswahl_der_Größe_Berechnung"

                 System.out.print ("Wieviel Stücke Zucker möchten Sie [0-5]:" );     // Abfrage: Wieviele Stücke Zucker
                 int Anzahl = scanner.nextInt ();                                    // Scan der Zuckerstücke
                 double Zr = Zucker (Anzahl);                                        // Aufruf der Funktion "Zucker"

                 System.out.printf ("Sie möchten einen %s %s mit %.0f Stück "        // Systemausgabe des Kaffes
                         + "Zucker ",AdG,Sw,Zr);

                 System.out.printf ("\n\n Kaffepulvermenge,Zuckermenge %.0f %.0f",
                         AdGB,SwB);                                      // Systemausgabe der Berechnung


                 System.out.println("\n Nochmal (j/n)?");                               // Abfrage Neustart-Programmstart
                 Scanner sc = new Scanner(System.in);
                 repeat = sc.next();
             }
             while (repeat.equals("j"));                                         // Ende der do-while-Schleife

         }
         // Ende des Hauptprogrammes
         //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         public static String Auswahl_der_Groeße (int Produkt)                   // Anfang: Funktion-Auswahl der Kaffeegröße
         {
             if (Produkt == 1)                                                   // Kleiner Kaffee
                 return Produkt1;                                                 // Rückgabe "Kleiner Kaffee"

             if (Produkt == 2)                                                   // Großer Kaffee
                 return Produkt2;                                                 // Rückgabe "Großer Kaffee"

             return "Unbekannt";                                                 // Rückgabe wenn nicht 1 oder 2 gedrückt
         }                                                                       // Ende: Funktion-Auswahl der Kaffeegröße
         public static double Auswahl_der_Groeße_Berechnung ( int Produkt)       // Anfang: Funktion-Auswahl der Kaffeegröße_Berechnung
         {
             double kp_gesamt = Kaffeepulver_gesamt;

             if (Produkt == 1)                                       // Kleiner Kaffee
             {
                 double kk_B =  kp_gesamt - Produkt10;
                 return kk_B;
             }
             if (Produkt == 2)                                   // Großer Kaffee
             {
                 double gk_B =  kp_gesamt - Produkt20;
                 return gk_B;
             }
             return 0;                                                      // Rückgabe wenn nicht 1 oder 2 gedrückt
         }
         //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         public static String Schwarz_Weiß (int Kaffee)                          // Anfang: Funktion-Auswahl Schwarz_Weiß
         {
             if (Kaffee == 1)                                                    // Schwarzer Kaffee
                 return Milch1;                                                  // Rückgabe "Schwarz"

             if (Kaffee == 2)                                                    // Weißer Kaffee
                 return Milch2;                                                  // Rückgabe "Weiß"

             return "Unbekannt";                                                 //Rückgabe wenn nicht 1 oder 2 gedrückt
         }
         /*    public static double Schwarz_Weiß_Berechnung ( int Kaffee )          // Anfang: Funktion-Auswahl Schwarz_Weiß_Berechnung
                {



                                                                                    // Rückgabe wenn nicht 1 oder 2 gedrückt
                }*/
         // Ende: Funktion-Auswahl Schwarz_Weiß
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         public static double Zucker (int Anzahl)                                // Anfang: Funktion-Auswahl Zucker
         {
             return Anzahl;                                                      // Rückgabe Anzahl der Stücke
         }                                                                       // Ende: Funktion-Auswahl Zucker
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     }