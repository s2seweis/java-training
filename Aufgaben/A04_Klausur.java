/**
 * Nehmen Sie an, 5 Teilnehmer schreiben eine Java-Klausur und erzielen dabei 96, 88, 75, 99 und 68 Punkte. 
 * Schreiben Sie ein Programm, das die durchschnittliche Punktzahl als Gleitpunktwert berechnet und anzeigt.
 */

package p02_aufgaben;


public class A04_Klausur {
	public static void main(String[] args) {
		int anzahlTeilnehmer = 5;
		double p1 = 96;
		double p2 = 88;
		double p3 = 75;
		double p4 = 99;
		double p5 = 68;
		double durchschnitt;

		durchschnitt = (p1 + p2 + p3 + p4 + p5) / anzahlTeilnehmer;
		System.out.println("Durschnitt: " + durchschnitt);

		// Was wuerde passieren, wenn p1 - p5 als int deklariert waeren? -->
		// Ergebnis = 85.0 --> int/int = int

	}
}
