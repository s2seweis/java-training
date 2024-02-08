package p03_AufgabenNeu;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Aufgabenstellung: Durchschnittstemperatur
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden drei Temperaturen einzugeben.
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden.
 */

public class A_03e_BMI_Methoden {

	public static double[] eingabeGewicht(int anzahl) {
		
		double[] gewicht = new double[anzahl];
		
		for (int i = 0; i < anzahl; i++) {
			gewicht[i] = Double.parseDouble(JOptionPane.showInputDialog("Gewicht " + (i + 1) + ":").replace(",", "."));
		}

		return gewicht;
	}

	public static double[] berechneBMI(double[] gewicht, int groesse) {
		
		double[] bmi = new double[gewicht.length];
		
		for (int i = 0; i < gewicht.length; i++) {
			bmi[i] = gewicht[i] / Math.pow(groesse / 100.0, 2.0);
		}
		
		return bmi;
	}


	public static String[] gewichtsKategorie(double[] bmi) {

		String[] kategorie = new String[bmi.length];
		
		for (int i = 0; i < bmi.length; i++) {
			if (bmi[i] < 18.5) {
				kategorie[i] = "Untergewicht";
			} else if (bmi[i] < 25) {
				kategorie[i] = "Normalgewicht";
			} else {
				kategorie[i] = "Übergewicht";
			}
		}
		
		return kategorie;
	}
	

	public static void feedbackAnzeigen(String name, double[] bmi, double[] gewicht, String[] kategorie) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		String ausgabe = "Willkommen " + name + "!\n\n";
		
		for (int i = 0; i < gewicht.length; i++) {
			ausgabe += "Gewicht: " + df.format(gewicht[i]) + " BMI: " + df.format(bmi[i]) + " Kategorie: " + kategorie[i] +"\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Ihr Name?");	
		int groesse = Integer.parseInt(JOptionPane.showInputDialog("Größe in cm"));
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl Tage?"));
		
		double[] gewicht = eingabeGewicht(anzahl);
		double [] bmi = berechneBMI(gewicht, groesse);
		String[] kategorie = gewichtsKategorie(bmi);

		
		feedbackAnzeigen(name, bmi, gewicht, kategorie);
	}

}
