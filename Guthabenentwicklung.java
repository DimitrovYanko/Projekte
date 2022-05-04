import java.text.DecimalFormat;
import java.util.Scanner;

public class Guthabenentwicklung {

public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");

		double guthaben = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Einzahlung an: ");
		double einzahlung = input.nextDouble();
		
		System.out.println("Bitte geben Sie das Zinssatz");
		double zinsen = input.nextDouble();
		
		System.out.println("Bitte geben Sie die gewünschte Monaten: ");
		int monate = input.nextInt();
		 
		System.out.println("Die vereinbarte Summe von ihnen pro Monat einzuzahlen ist: " + einzahlung + " €");
		System.out.println("Die Zinsen pro Monat sind: " + zinsen + " %");
		System.out.println("");
		
		for (int a = 0; a <= monate; a++)
			 {
			 guthaben = guthaben + einzahlung + ((guthaben * zinsen) / 100);
			 
			 System.out.println(df.format(guthaben));
			 }
		int i = 0;
		System.out.println("");
		System.out.println("Für " + monate + " Monaten würden Sie " + df.format(guthaben) + " haben wenn Sie jeden Monat " + einzahlung + " € einzahlen mit " + zinsen + " % zinsen pro Monat.");	
	}

}
