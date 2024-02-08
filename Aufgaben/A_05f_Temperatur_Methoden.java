package p03_AufgabenNeu;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Aufgabenstellung: Durchschnittstemperatur
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden drei Temperaturen einzugeben.
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden.
 */
public class A_05f_Temperatur_Methoden {

	public static double[] eingabeTemperaturen(int anzahl) {

		double[] temperaturen = new double[anzahl];

		for (int i = 0; i < anzahl; i++) {
			temperaturen[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Temperatur " + (i + 1) + ":").replace(",", "."));
		}

		return temperaturen;
	}

	public static double berechneDurchschnitt(double[] temperaturen) {

		double sumTemp = 0;

		for (int i = 0; i < temperaturen.length; i++) {
			sumTemp += temperaturen[i];
		}

		double durchschnitt = sumTemp / temperaturen.length;

		return durchschnitt;

	}

	public static void feedbackAnzeigen(String ort, int anzahl, double durchschnitt) {

		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, "In " + ort + " war die Durschnittstemperatur der letzten " + anzahl
				+ " Tage " + df.format(durchschnitt) + " Grad C°.");

		if (durchschnitt < 20) {
			JOptionPane.showMessageDialog(null, "Noch kein Sommer!");
		} else {
			JOptionPane.showMessageDialog(null, "Zeit für T-Shirt!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variablen

		String ort = JOptionPane.showInputDialog("Ort:");
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl Temperaturen:"));
		double[] temperaturen = eingabeTemperaturen(anzahl);
		double durchschnitt = berechneDurchschnitt(temperaturen);

		feedbackAnzeigen(ort, anzahl, durchschnitt);

	}
}
