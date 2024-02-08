package p01_demo;

import java.io.FileWriter;
import java.io.IOException;

public class D18_Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw;
		try {
			// Erstellen der Datei
			// true -> aktiviert den Append-Modus --> behalten was in Datei steht und am Ende anhängen
			fw = new FileWriter("test.txt", true);
			// Schreibt eine Zeile in die Datei
			fw.write("Hier kommt der Text\r\n");
			fw.write("noch eine zeile mehr");
			//  Schließt die Datei und "speichert"
			fw.close();
		}catch(IOException error) {
			System.out.println("Fehler");
			System.out.println(error.getMessage());
		}
		System.out.println("Hier geht Programm weiter");		

	}

}
