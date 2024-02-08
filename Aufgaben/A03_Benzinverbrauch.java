package p02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A03_Benzinverbrauch {	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eingabe Liter:");
		double liter = scanner.nextDouble();
		System.out.println("Eingabe Strecke: ");
		double strecke = scanner.nextDouble();		
		
		scanner.close(); 
		
		double durchschnitt = 0.0;
		System.out.println();
		
		// Durchschnittsberechnung
		durchschnitt = liter / strecke * 100;
		
		// Objekt der Klasse DecimalFormat erzeugt mit dem Namen df
		DecimalFormat df_liter = new DecimalFormat("0.00");
		df_liter.setPositiveSuffix("L");
		DecimalFormat df_strecke = new DecimalFormat("0.00");
		df_strecke.setPositiveSuffix("KM");
				
		
		System.out.println("Getankte Liter: " + df_liter.format(liter));
		System.out.println("Gefahrene Kilometer: " + df_strecke.format(strecke));
		// Methode format() der Klasse DecimalFormat wird angewendet
		System.out.println("Durchschnittsverbrauch: " + df_liter.format(durchschnitt));	

		
		
	}

}
