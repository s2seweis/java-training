package p01_demo;

import java.util.Arrays;

public class D17_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] farben = new String[4];
		farben[3] = "rosa";
		farben[0] = "rot";
		farben[1] = "blau";
		farben[2] = "gelb";
		
		//System.out.println(farben[0]);
		
		
		//System.out.println(farben[0]);
		
		String[] colors = {"lila", "grün", "schwarz", "orange"};
		
		//System.out.println(colors[3]);
		
		//System.out.println(farben.length);
		
		
		
		for(int i = 0; i < farben.length; i++) {
			System.out.println(farben[i]);
		}
		
		// sortiert das Array aufsteigend
		Arrays.sort(farben);
		
		
		System.out.println("------");
		//Kurzschreibweise foreach
		for(String hasi : farben) {
			System.out.println(hasi);
		}
		
		int summe = 0;
		int[] zahlen = {1, 13, 23, 5, 12};
		for(int i = 0; i < zahlen.length; i++) {
			summe += zahlen[i];
		}
		System.out.println(summe);
		
// bei 0 beginnen
// length		
		

	}

}
