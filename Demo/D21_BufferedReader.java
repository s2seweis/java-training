package p01_demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class D21_BufferedReader {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("GV100AD_31012024.txt");
			BufferedReader br = new BufferedReader(fr);
			String zeile;
			while((zeile = br.readLine()) != null) {
				if(zeile.startsWith("60")) {
				System.out.println("PLZ: " +zeile.substring(165, 170));
				System.out.println("Ort: " +zeile.substring(22,72));
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
