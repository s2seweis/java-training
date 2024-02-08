/**
 * M01_Grundlagen
 * Gehen Sie von einem Einkommensteuersatz von 20% aus. Legen Sie mit Hilfe einer Zuweisung ein Bruttogehalt fest. 
 * Berechnen und zeigen Sie dann Bruttogehalt, Nettogehalt und Abz�ge an. Geben Sie erkl�rende Texte dazu aus.
 */

package p02_aufgaben;

public class A05_Gehalt {
	public static void main(String[] args) {
		double bruttoGehalt;
		double nettoGehalt;
		double abzuege;
		double steuerSatz = 20;
		double steuerSatzProzent = steuerSatz / 100; 

		bruttoGehalt = 2000.50;

		abzuege = bruttoGehalt * steuerSatzProzent;

		nettoGehalt = bruttoGehalt - abzuege;

		System.out.println("Brutto: " + bruttoGehalt);
		System.out.println("Abzuege: " + abzuege);
		System.out.println("Netto: " + nettoGehalt);

	}

}
