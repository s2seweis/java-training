package p02_aufgaben;

import java.util.Scanner;

public class a_if_tageszeit {

	public static void main(String[] args) {
		/* Schreibe ein Programm, das den Benutzer nach einer Stunde des Tages fragt. 
		 * Gib eine Meldung aus, ob es Morgen (6-12 Uhr), Nachmittag (13-18 Uhr), 
		 * Abend (19-24 Uhr) oder Nacht (0-5 Uhr) ist.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welche Stunde hat geschlagen?");
		
		int stunde = scanner.nextInt();
		scanner.close();
		
		if(stunde >= 0 && stunde <= 24) {
			if(stunde >= 6 && stunde < 12) {
				System.out.println("Morgen");
			}else if(stunde >= 12 && stunde <= 18){
				System.out.println("Nachmittag");
			}else if(stunde >= 19 && stunde <= 24) {
				System.out.println("Abend");
			}else {
				System.out.println("Nacht");
			}
		}else {
			System.out.println("Keine gültige Zeit");
		}
	}

}
