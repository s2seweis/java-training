package p02_aufgaben;

import java.util.Scanner;

public class TannenbaumBenutzer {

	public static void main(String[] args) {
		
		//Alternative mit Array statt switch
		String[] farben = {"\u001b[35m", "\u001b[31m", "\u001b[34m", "\u001b[33m"};
		
		String farbeKugel1 = "";
		String farbeKugel2 = "";
		
		System.out.println("Wieviele Reihen mit Ästen?");
		
		Scanner scanner = new Scanner(System.in);
		
		// Benutzereingabe - Baumhöhe
		int hoehe = scanner.nextInt();
		
		System.out.println("Zeichen für Kugel 1 eingeben");
		String kugel1 = scanner.next();
		System.out.println("Farbe für Kugel 1 eingeben: Lila(0), Rot(1), Blau(2), Gelb (3)");
		int farbe1 = scanner.nextInt();
		System.out.println("Zeichen für Kugel 2 eingeben");
		String kugel2 = scanner.next();
		System.out.println("Farbe für Kugel 2 eingeben: Lila(0), Rot(1), Blau(2), Gelb (3)");
		int farbe2 = scanner.nextInt();
		
		/* Alternative mit Switch statt Array
		switch(farbe1) {
		case 0:
			// lila
			farbeKugel1 = "\u001b[35m";
			break;
		case 1: 	
			// rot
			farbeKugel1 = "\u001b[31m";
			break;
		case 2: 	
			//blau
			farbeKugel1 = "\u001b[34m";
			break;
		case 3: 	
			// geld
			farbeKugel1 = "\u001b[33m";
			break;
			
		}
		
		// Alternative mit Switch statt Array
		switch(farbe2) {
		case 0:
			// lila
			farbeKugel2 = "\u001b[35m";
			break;
		case 1: 	
			// rot
			farbeKugel2 = "\u001b[31m";
			break;
		case 2: 	
			//blau
			farbeKugel2 = "\u001b[34m";
			break;
		case 3: 	
			// geld
			farbeKugel2 = "\u001b[33m";
			break;
			
		}*/
		
		
		// Äusser Schleife = Höhe vom Baum
		for(int i = 0; i < hoehe; i++) {
			// Leerzeichen vor dem *
			for(int x = 0; x < hoehe - i - 1; x++) {
				System.out.print(" ");
			}
			// Zweige & Kugeln
			for(int z = 0; z < 2 * i + 1 ;z++) {
				// Zufallswert erzeugen 0.0 - 0.9999999999
				// wenn Zufallswert kleiner als 30 % bzw. 0,3 dann Kugel
				if(Math.random() < 0.3) {
					// zwei Farben bei Kugeln --> z gerade oder ungerade
					// % Modulo --> liefert den Rest einer Division
					if(z % 2 == 0) {
						//Alternative mit Array statt switch
						//System.out.print(farben[farbe1] + kugel1 + "\u001b[0m");
						System.out.print(farben[farbe1] + kugel1 + "\u001b[0m");
					}else {
						//Alternative mit Array statt switch
						//System.out.print(farben[farbe2] + kugel2+ "\u001b[0m");
						System.out.print(farben[farbe2] + kugel1 + "\u001b[0m");
					}
				}else {
				 // wenn Zufallswert größer als 0.3 soll er Zweig zeichnen	
				 // Farbe auf grün wechseln, Zweig zeichnen, Farbe wieder auf schwarz	
				// ANSI Escape Codes --> https://en.wikipedia.org/wiki/ANSI_escape_code
				 System.out.print("\u001b[32m" + "*" + "\u001b[0m");
				}
			}
			System.out.println();
			
		}// Schleife für Äste fertig
		
		// Stamm zeichnen
		int stammHoehe = hoehe / 3; // 1/3 der Baumhöhe
		int stammBreite = hoehe / 2; // Hälfte der Baumhöhe
		// Beispiel Höhe  5 --> 2 * 5 = 10 - 2 = 8 / 2 =  4
		int stammPosition = (2 * hoehe -stammBreite) / 2;
		
		for(int sh = 0;  sh < stammHoehe ;sh++) {
			
			// Positionieren vom Stamm --> nach rechts verschieben mit Leerzeichen
			for(int sp = 0; sp < stammPosition; sp++) {
				System.out.print(" ");
			}
			// Zeichnen vom Stamm
			for(int sb = 0; sb < stammBreite; sb++) {
				System.out.print("\u001b[33m" + "#" + "\u001b[0m" );
			}
			System.out.println();
		}
		
		
		
		
		
		// TODO Auto-generated method stub
		
		// Basis:
		/*
		for(int i = 1; i <= reihen; i++) {
			for --> leerzeichen
			for --> *
			System.out.println(ausgabe);
			ausgabe = ausgabe  + "*";
		}*/
		
		// Schleife für Zweige/ Körper --> hoehe
			// Schleife --> wieviele Leerzeichen vor *
			// Schleife -- > wieviele Zeichen in Reihe/ Zweig 	
		
				
		// --erstmal bis hier hin ---
		
				// Zufällige Verteilung der Kugel Math.random() 
				// Bedinungsprüfung Kugel oder Stern --> Math.random() < 0.2
		
		// -- nächster Zwischenschritt - Kugeln dran ----
		
			
		// Schleife für Stamm
			// Prinzip wie Körper, erst Leerzeichen um Stamm mittig zu bekommen
			// in Abhängigkeit von Körper-Höhe (Anzahl der Reihen mit * oder O)
			// Breite --> Stamm soll mittig von Zweigen
		
		// --- nächster Zwischenschritt - Baum hat auch einen Stamm ----
		
		
		
		// Optional: Benutzer soll Höhe von Baum eingeben können
		// Optional: Breite vom Stamm
		// Optional: Bunte Kugeln	
		
		// --- letzter Schritt - Benutzerdefinierter Baum ----
		

	}

}
