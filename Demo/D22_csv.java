package p01_demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class D22_csv {

	public static void main(String[] args) {
		
		String[] arrayNachnamen = new String[10]; 
		String[] arrayPLZ = new String[10];
		int i = 0;
		try {
			FileReader fr = new FileReader("adressen.csv");
			BufferedReader br = new BufferedReader(fr);
			//Überspringen der 1. Zeile
			String header = br.readLine();
			String zeile;
			while((zeile = br.readLine()) != null) {
				//System.out.println(zeile);
				StringTokenizer st = new StringTokenizer(zeile, ";");
				arrayNachnamen[i] = st.nextToken();
				// "Spalte"/ Wert überspringen
				st.nextToken();
				arrayPLZ[i] = st.nextToken();
				i++;
			}
			
			//System.out.println("von vorher gespeichert" +header);
			
			br.close();
			fr.close();
			
		}catch(Exception e) {
			System.out.println("Fehler");
		}	
		
		for(int x = 0; x < arrayNachnamen.length; x++) {
			System.out.println(arrayNachnamen[x]);
			System.out.println(arrayPLZ[x]);
		}
		
	}
}
