package p02_aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class TannenbaumBenutzerMethoden {
	
	
	public static String farbeAuswahl(Scanner scanner) {
		
		// TODO --> Nur Eingabe von 0-3 zulassen --> scanner.hasNextInt(), zusätzlich farben.length
		String[] farben = { "\u001b[35m", "\u001b[31m", "\u001b[34m", "\u001b[33m"};
		String[] farbNamen = {"Lila(0)", "Rot(1)", "Blau(2)", "Gelb (3)", "lilagrüngetupft"};
		System.out.println("Kugelfarbe:" + Arrays.toString(farbNamen));
		int farbe;
		
		while(true) {
			while(!scanner.hasNextInt()) {
				System.out.println("Falsche Eingabe! Zahl eingeben. Kugelfarbe: Lila(0), Rot(1), Blau(2), Gelb (3)");
				scanner.next();
			}
			
			farbe = scanner.nextInt();
			
			if(farbe >= 0 && farbe < farben.length) {
				break;
			}else {
				System.out.println("Zahl muss zwischen 0 - "+ (farben.length - 1) +" sein");
			}
		}
		
		String farbeKugel = farben[farbe];
		return farbeKugel;
	}
	
	public static String kugelAuswahl(Scanner scanner) {
		System.out.println("Zeichen für Kugel eingeben");		
		String symbolKugel = scanner.next();
		if (symbolKugel.length() > 0) {             
			symbolKugel = symbolKugel.substring(0, 1);
		}
		return symbolKugel.toUpperCase();
	}
	
	public static int hoeheAuswahl(Scanner scanner) {
		// TODO --> war eingabe wirklich ein Integer --> scanner.hasNextInt()
		System.out.println("Baumhöhe?");
		int hoehe;
		while(true) {
			if(scanner.hasNextInt()) {
				hoehe = scanner.nextInt();
				break;
			}else {
				System.out.println("Falsche Eingabe! Bitte ganze Zahl eingeben!");
				// Scanner leeren
				scanner.next();
			}
		}
	
		return hoehe;
	}
	
	public static int anzahlBaeume(Scanner scanner) {
		
		// TODO --> war eingabe wirklich ein Integer --> scanner.hasNextInt()
		int anzahl;
			while(true) {
				// war Eingabe wirklich eine Zahl(Integer)
			if(scanner.hasNextInt()) {
				anzahl = scanner.nextInt();
				break;
			}else {
				System.out.println("Falsche Eingabe! Bitte ganze Zahl eingeben!");
				// Scanner leeren
				scanner.next();
			}
		}
		return anzahl; 
	}
	
	public static void zeichneStamm(int hoehe) {
		// TODO --> war eingabe wirklich ein Integer --> scanner.hasNextInt()
		// Stamm zeichnen
		int stammHoehe = hoehe / 3; // 1/3 der Baumhöhe
		int stammBreite = hoehe / 2; // Hälfte der Baumhöhe
		// Beispiel Höhe 5 --> 2 * 5 = 10 - 2 = 8 / 2 = 4
		int stammPosition = (2 * hoehe - stammBreite) / 2;

		for (int sh = 0; sh < stammHoehe; sh++) {

			// Positionieren vom Stamm --> nach rechts verschieben mit Leerzeichen
			for (int sp = 0; sp < stammPosition; sp++) {
				System.out.print(" ");
			}
			// Zeichnen vom Stamm
			for (int sb = 0; sb < stammBreite; sb++) {
				System.out.print("\u001b[33m" + "#" + "\u001b[0m");
			}
			System.out.println();
		}

	}
	
	public static void zeichneAeste(int hoehe, String farbeKugel1, String farbeKugel2, String kugel1, String kugel2) {
		// Äusser Schleife = Höhe vom Baum
				for (int i = 0; i < hoehe; i++) {
					// Leerzeichen vor dem *
					for (int x = 0; x < hoehe - i - 1; x++) {
						System.out.print(" ");
					}
					// Zweige & Kugeln
					for (int z = 0; z < 2 * i + 1; z++) {
						// Zufallswert erzeugen 0.0 - 0.9999999999
						// wenn Zufallswert kleiner als 30 % bzw. 0,3 dann Kugel
						if (Math.random() < 0.3) {
							// zwei Farben bei Kugeln --> z gerade oder ungerade
							// % Modulo --> liefert den Rest einer Division
							if (z % 2 == 0) {
								// Alternative mit Array statt switch
								// System.out.print(farben[farbe1] + kugel1 + "\u001b[0m");
								// farbe1 ist ein int --> kommt aus Nutzereingabe nextInt()
								System.out.print(farbeKugel1 + kugel1 + "\u001b[0m");
							} else {
								// Alternative mit Array statt switch
								// System.out.print(farben[farbe2] + kugel2+ "\u001b[0m");
								System.out.print(farbeKugel2 + kugel2 + "\u001b[0m");
							}
						} else {
							// wenn Zufallswert größer als 0.3 soll er Zweig zeichnen
							// Farbe auf grün wechseln, Zweig zeichnen, Farbe wieder auf schwarz
							// ANSI Escape Codes --> https://en.wikipedia.org/wiki/ANSI_escape_code
							System.out.print("\u001b[32m" + "*" + "\u001b[0m");
						}
					}
					System.out.println();

				} // Schleife für Äste fertig
		
	}
	
	public static void zeichneBaum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wieviel Bäume?");
		int anzahl = anzahlBaeume(scanner);
		int hoehe = hoeheAuswahl(scanner);
		/*
		String farbeKugel1 = farbeAuswahl(scanner);
		String farbeKugel2 = farbeAuswahl(scanner);
		String symbolKugel1 = kugelAuswahl(scanner);
		String symbolKugel2= kugelAuswahl(scanner);
		*/
		
		
		
		for(int i = 1; i <= anzahl; i++) {		
			//zeichneAeste(10, "\u001b[35m", "\u001b[31m", "0", "$" );
			//zeichneAeste(hoehe, farbeKugel1, farbeKugel2, symbolKugel1, symbolKugel2);
			zeichneAeste(hoehe, farbeAuswahl(scanner), farbeAuswahl(scanner), kugelAuswahl(scanner), kugelAuswahl(scanner));
			zeichneStamm(hoehe);
		}
		
		scanner.close();
	}
	
	

	public static void main(String[] args) {

		zeichneBaum();

	}

}
