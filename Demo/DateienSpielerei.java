package p01_demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class DateienSpielerei {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("Teilnehmer.txt");
			BufferedReader br = new BufferedReader(fr);
			String zeile;
			while((zeile = br.readLine()) != null) {
				if(zeile.startsWith("20")) {
				System.out.println(zeile.substring(8, 18));
				System.out.println(zeile.substring(3,7));
				}
			}
			
			
		}catch(Exception e) {
			System.out.println("Fehler");
		}
		finally {
			System.out.println("Wird auf jeden Fall ausgeführt");
		}
		
		System.out.println("Hier gehts wieder weiter");

	}

}
