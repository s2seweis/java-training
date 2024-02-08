package p03_AufgabenNeu;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Aufgabenstellung: Durchschnittsnote
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden drei Temperaturen einzugeben.
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden.
 */
public class A_04f_Notenrechner_Methoden {

	public static double[] eingabeKlausuren(int anzahl) {

		double[] klausuren = new double[anzahl];

		for (int i = 0; i < anzahl; i++) {
			klausuren[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Klausur " + (i + 1) + ":").replace(",", "."));
		}

		return klausuren;
	}

	public static double berechneDurchschnitt(double[] klausuren) {

		double sumKlausuren = 0;

		for (int i = 0; i < klausuren.length; i++) {
			sumKlausuren += klausuren[i];
		}

		double durchschnitt = sumKlausuren / klausuren.length;

		return durchschnitt;

	}

	public static void feedbackAnzeigen(String fach, int anzahl, double durchschnitt) {

		DecimalFormat df = new DecimalFormat("0.00");

		// Werte ausgeben
		JOptionPane.showMessageDialog(null, "In " + fach + " war die Durschnittsnote der letzten " + anzahl
				+ " Klausuren " + df.format(durchschnitt) + ".");

		// Erweiterung um Bedingung
		if (durchschnitt < 2.0) {
			JOptionPane.showMessageDialog(null, "Sie haben sehr gute Leistungen erbracht");
		} else {
			JOptionPane.showMessageDialog(null, "Sie sollten noch etwas lernen");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variablen

		String fach = JOptionPane.showInputDialog("Fach:");
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl Klausuren:"));
		double[] klausuren = eingabeKlausuren(anzahl);
		double durchschnitt = berechneDurchschnitt(klausuren);

		feedbackAnzeigen(fach, anzahl, durchschnitt);

	}
}
