package p03_AufgabenNeu;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Aufgabenstellung:
 * Ein Benutzer soll aufgefordert werden die gefahrene Strecke in Kilometern und die getankten Liter Kraftstoff einzugeben.
 * Aus den Angaben soll der Durchschnittsverbrauch pro 100 Kilometer berechnet werden und dem Benutzer angezeigt werden
 */
public class A_02d_Benzinrechner_Methoden {

	public static double benutzerEingaben(String anweisung) {
		String eingabe = JOptionPane.showInputDialog(anweisung);
		eingabe = eingabe.replace(',', '.');
		double eingabeDouble = Double.parseDouble(eingabe);
		return eingabeDouble;
	}

	public static double berechneDurchschnitt(double liter, double strecke) {
		double durchschnitt = liter / strecke * 100;
		return durchschnitt;
	}

	public static void feedbackAnzeigen(double liter, double strecke, double durchschnitt) {
		DecimalFormat df = new DecimalFormat("0.00");
		JOptionPane.showMessageDialog(null,
				"verbrauchter Kraftstoff: " + df.format(liter) + " Liter, gefahrene Strecke: " + df.format(strecke)
						+ " km, der Durchschnittsverbrauch ist " + df.format(durchschnitt) + " l/100 km");

		if (durchschnitt > 12) {
			JOptionPane.showMessageDialog(null, "Bitte sparsamer fahren!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double strecke = benutzerEingaben("Gefahrene Strecke");
		double liter = benutzerEingaben("Getankte Liter");
		double durchschnitt = berechneDurchschnitt(liter, strecke);

		feedbackAnzeigen(liter, strecke, durchschnitt);
	}

}
