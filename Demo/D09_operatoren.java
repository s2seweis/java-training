package p01_demo;

public class D09_operatoren {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		int c = 4;
		int d = 4;
		double e = 4.0;
		
		boolean ergebnis;
		
		ergebnis = a < b; // false
		ergebnis = a > b; // false
		ergebnis = a == b; // true
		ergebnis = a <= 5; // true
		
		ergebnis = ((a==b) && (c==d)); // true
		ergebnis = ((a==b) || (c==d)); // true
		ergebnis = ((a==b) ^ (c==d)); // false 
		
		ergebnis = a != b; // false
		ergebnis = a != c; // true
		ergebnis = (3*(1/3) == 1); // false --> Ganzzahl-Division
		ergebnis = (3*(1/3.0) == 1); // true
		// ergebnis = (3*(1/3.0) === 1); (equals, type)
		
		ergebnis = 3.0*0.3 == 0.9; // Rundungsdifferenz
		double abweichung = 1e-10; // Toleranz
		ergebnis = Math.abs(3*0.3-0.9) < abweichung;
		
		double zahl = 3.0 * 0.3;
		if(ergebnis) {
			zahl = Math.round(zahl*10.0) / 10.0; // liefert 1
		}
		
		
		System.out.println(zahl);

	}

}
