package p02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GehaltsRechner {

	public static void main(String[] args) {
		
		double bruttoGehalt =0.00;
		double nettoGehalt;
		double abzuege;
		double steuerSatz;		
		double steuerSatzProzent;
		
		// Variante 1: relativ unbrauchbar, da wird immer Quellcode anpassen müssten
		// bruttoGehalt = 3245.47;
		// steuerSatz = 20;
		
		// Variante 2: Benutzereingaben
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Bruttogehalt eingeben:");
		
		
		if(eingabe.hasNextDouble()) {
			bruttoGehalt = eingabe.nextDouble();
		}else {
			System.out.println("Falsche Eingabe!");
			System.exit(0);
		}
		
		
		System.out.println("Steuersatz eingeben:");
		steuerSatz = eingabe.nextDouble();
		
		
		
		
		steuerSatzProzent = steuerSatz / 100;
		//steuerSatzProzent = (double) steuerSatz / 100;
		System.out.println(steuerSatzProzent);
		abzuege = bruttoGehalt * steuerSatzProzent;
		nettoGehalt = bruttoGehalt - abzuege;	
		
		DecimalFormat meinFormat = new DecimalFormat(",###.00");
		meinFormat.setPositiveSuffix("€");
		
		System.out.println("Brutto: " + meinFormat.format(bruttoGehalt));
		System.out.println("Abzüge: " + meinFormat.format(abzuege));
		System.out.println("Netto: " + meinFormat.format(nettoGehalt));

	}

}
