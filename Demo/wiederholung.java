package p01_demo;

public class wiederholung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int zahl = 42;
		// Casting - implizit --> von kleinerem in größeren Datentyp 
		double andereZahl = zahl;
		String zahlAlsText = "42,5";
		// Parsen
		andereZahl = Double.parseDouble(zahlAlsText.replace(",", "."));
		System.out.println(andereZahl);
		System.out.println(zahlAlsText);
		System.out.println("Weiter gehts");
		
		
		double zahl = 42.67;
		// explizites Casting --> von größerem in kleineren Datentyp --> Datenverlust
		int neueZahl = (int)zahl;
		System.out.println(neueZahl);
		
		int zahl = 40;
		
		for(int i = zahl; i <10 ; i++) {
			System.out.println(i);
		}
		
		int i = zahl;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		i = 5;
		do {
			System.out.println(i);
			i++;
		}while(i <10);
	*/
		
		double[] noten = new double[4];
		noten[0] = 1.0;
		noten[1] = 5.3;
		noten[2] = 2.7;
		noten[3] = 1.5;
		noten[4] = 5.7;

		
		//double[] noten = {1.0, 5.3, 2.7, 1.5, 3.3}; 
		double durchschnitt = 0;
		for(int i = 0; i < noten.length; i++) {
			//System.out.println(noten[i]);
			
			durchschnitt = durchschnitt + noten[i];
		}
		durchschnitt = durchschnitt / noten.length;
		System.out.println(durchschnitt);
		
	}	

}














