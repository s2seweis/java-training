package p02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class A03_Benzinverbrauch_JOptionPane {	
	
	public static void main(String[] args) {
	
		
		double liter = 0.0;
		double strecke = 0.0;
		double durchschnitt = 0.0;
		String eingabe = "";
		
		eingabe = JOptionPane.showInputDialog("Strecke");
		// Problem Komma in Fließkommazahl... wird brauchen einen Punkt
		eingabe = eingabe.replace(",", ".");
		// String in Double umwandeln / parsen
		strecke = Double.parseDouble(eingabe);
		
		// Es können noch Fehler passieren... aber dazu später mehr
		// Schleifen, Fehlerbehandlung
		eingabe = JOptionPane.showInputDialog("Liter");
		// Problem Komma in Fließkommazahl... wird brauchen einen Punkt
		eingabe = eingabe.replace(",", ".");
		// String in Double umwandeln / parsen
		liter = Double.parseDouble(eingabe);


		// Durchschnittsberechnung
		durchschnitt = liter / strecke * 100;
		
		// Objekt der Klasse DecimalFormat erzeugt mit dem Namen df
		DecimalFormat df_liter = new DecimalFormat("0.00");
		df_liter.setPositiveSuffix("L");
		DecimalFormat df_strecke = new DecimalFormat("0.00");
		df_strecke.setPositiveSuffix("KM");
				

		JOptionPane.showMessageDialog(null, "Durchschnittsverbrauch: " + df_liter.format(durchschnitt));
		

		
		
	}

}
