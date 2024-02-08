package p02_aufgaben;

import java.util.Scanner;

public class a_if_monat {

	public static void main(String[] args) {
		/*
		 * Schreibe ein Programm, das den Benutzer nach einem Monat (als Zahl) fragt.
		 * Gib den Namen des Monats aus. Wenn die eingegebene Zahl außerhalb des
		 * Bereichs von 1 bis 12 liegt, gib eine Meldung aus, dass die Eingabe ungültig
		 * ist.
		 */

		// String monatsName = "ungültig";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Monat als Zahl?");

		int monat = scanner.nextInt();
		scanner.close();

		if (monat >= 1 && monat <= 12) {
			String monatsName = "";
			if (monat == 1) {
				// System.out.println("Januar");
				monatsName = "Januar";
			} else if (monat == 2) {
				// System.out.println("Februar");
				monatsName = "Februar";

			} else if (monat == 3) {
				monatsName = "März";
			} else if (monat == 4) {
				monatsName = "April";
			} else if (monat == 5) {
				monatsName = "Mai";
			} else if (monat == 6) {
				monatsName = "Juni";
			} else if (monat == 7) {
				monatsName = "Juli";
			} else if (monat == 8) {
				monatsName = "August";
			} else if (monat == 9) {
				monatsName = "September";
			} else if (monat == 10) {
				monatsName = "Oktober";
			} else if (monat == 11) {
				monatsName = "November";
			} else if (monat == 12) {
				monatsName = "Dezember";
			}
			System.out.println("es ist: " + monatsName);
		} else {
			System.out.println("ungültig");
		}

	}

}
