package p01_demo;

public class D02_Variablen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menge = 10;
		// Bei Fließkommazahlen immer Punkt! kein Komma!
		double preis = 9.99;
		double summe = menge * preis;
		
		//syso strg+leer
		System.out.println("Menge: " + menge);
		System.out.println("Preis: " + preis);
		System.out.println("Summe: " + summe);
		System.out.println(menge + preis);
		System.out.println("Summe: " + (menge + preis));
		System.out.println(Double.MAX_VALUE);
	}

}
