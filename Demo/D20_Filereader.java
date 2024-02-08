package p01_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class D20_Filereader {

	public static void main(String[] args) {
		
		try {
			// Öffnen der Datei
			FileReader fr = new FileReader("Demo.txt");
			int c;
			// zeichenweise einlesen
			//wenn kein weiteres Zeichen kommt -1
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
			fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("Datei konnte nicht gefunden werden!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println("Fehler mit der Datei!");
		}
		finally {
			System.out.println("Ich bin immer da");
		}
		
		System.out.println("hier gehts weiter");

	}

}
