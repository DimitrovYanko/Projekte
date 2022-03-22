package Java.ProzentRechner;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProzentTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        DecimalFormat decimal = new DecimalFormat("#.00");

        while (true) {
            System.out.println();
            System.out.println("\t-Prozent Rechner-");
            System.out.println("$_1_$ Prozentualer Anteil eines Wertes: ?");
            System.out.println("$_2_$ Prozentsatz ein Zielwertes: ?");
            System.out.println("$_3_$ Wie viel % hat sich erhöht ?");
            System.out.println("$_4_$ Wie viel % hat sich verringert ?");

            System.out.println("Menü auswählen:\t");
            int wahl = s.nextInt();

            if(wahl == 1) {
                System.out.print("Prozent eingeben: ");
                double przent = s.nextInt();
                System.out.print("Von : ");
                double wert = s.nextInt();
                System.out.println(przent + " % von " + wert + " sind " + wert * przent / 100 );
            }
            else if (wahl == 2) {
                System.out.println("Wie viele prozent von Grundwert: ");
                double prozent = s.nextInt();
                System.out.println("Grundwert : ");
                double Grundwert = s.nextInt();
                System.out.println("Das sind: " + ((Grundwert * (prozent/100)) ));
                // System.out.println("Das sind: " + ((prozent / Grundwert) * 100 ) + "%");
            }
            else if(wahl == 3) {
                System.out.println("erhöhte wert: ");
                double erhoehtewert = s.nextInt();
                System.out.println("Grund wert: ");
                double grundwert = s.nextInt();
                System.out.println("sind: " + decimal.format(((erhoehtewert - grundwert) / grundwert) * 100) + "%"  );
            }
            else if(wahl == 4) {
                System.out.println("Aktuelle Wert: ");
                double aktuelewert = s.nextInt();
                System.out.println("Start Wert: ");
                double startwert = s.nextInt();
                System.out.println("Um so viele % hat sich verringert " + (aktuelewert - startwert) / startwert * 100 + "%");
            }
        }
    }
}