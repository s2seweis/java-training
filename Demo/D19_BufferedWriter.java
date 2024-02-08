package p01_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class D19_BufferedWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("Demo.txt");
			// Zwischenspeichern über BufferedWriter
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 1; i <= 100; i++) {
				if(i < 100) {
				bw.write(" " + i + ". Zeile");
				}else {
					bw.write(i + ". Zeile");
				}
				bw.newLine();
			}
			
			/*bw.write("Hier kommt Inhalt");
			bw.newLine();
			bw.write("noch mehr Inhalt");
			*/
			
			// Puffer schliessen
			bw.close();
			
			// Datei schliessen
			fw.close();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
