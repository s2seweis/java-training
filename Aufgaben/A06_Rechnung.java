/**
 * M01_Grundlagen
 * Berechnen Sie den Rechnungsbetrag zu einer zugewiesenen Menge und einem zugewiesenen 
 * Einzelpreis und zeigen Sie alle Werte mit Text am Bildschirm an.
 * Ber�cksichtigen Sie noch zus�tzlich 16% Mehrwertsteuer.
 */

package p02_aufgaben;

public class A06_Rechnung {

	public static void main(String[] args) {

		double rgBetrag;
		int menge = 40;
		double preis = 2.50;
		double steuerSatz = 19;
		double steuerSatzProzent = steuerSatz / 100;
		double steuerBetrag;
		double nettoPreis;

		nettoPreis = menge * preis;
		// Alternative 1:
		steuerBetrag = nettoPreis * steuerSatz / 100;
		// Alternative 2: spart Tipparbeit, da wir /100 nicht jedesmal eingeben m�ssen
		steuerBetrag = nettoPreis * steuerSatzProzent;


		rgBetrag = nettoPreis + steuerBetrag;

		System.out.println("Bestellmenge: " + menge);
		System.out.println("Preis: " + preis);
		System.out.println("Nettopreis: " + nettoPreis);
		System.out.println("Mehwertsteuer: " + steuerBetrag);
		System.out.println("Rechnungsbetrag: " + rgBetrag);
	}
}
