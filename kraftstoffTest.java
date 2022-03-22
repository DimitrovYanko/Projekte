package Java.KraftstoffRechner;

import javax.swing.JOptionPane;

public class kraftstoffTest {

    public static void main(String[] args) {
        String kmProMonat, verbrauch, preisProLiter;
        double kpm;
        double v;
        double ppl;

        kmProMonat = JOptionPane.showInputDialog("Km pro Monat: ");
        verbrauch = JOptionPane.showInputDialog("Verbrauch: ");
        preisProLiter = JOptionPane.showInputDialog("Preis pro Liter: ");

        kpm = Double.parseDouble(kmProMonat);
        v = Double.parseDouble(verbrauch);
        ppl = Double.parseDouble(preisProLiter);

        System.out.println("Km pro Monat: " + kpm);
        System.out.println("Verbrauch auf 100km: " + v);
        System.out.println("Preis pro Liter: " + ppl);
        System.out.println("Euro pro Monat: " + kpm * v * ppl / 100 + " " + "€");
        JOptionPane.showMessageDialog(null,"Euro pro Monat: " + kpm * v * ppl / 100 + " " + "€", "Verbraucherrechner", JOptionPane.PLAIN_MESSAGE);

    }
    

}
