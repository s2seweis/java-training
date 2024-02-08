package p02_aufgaben;

import java.util.Scanner;

public class a_switch_monat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Monat als Zahl?");

		int monat = scanner.nextInt();
		scanner.close();
		
		String monatsName = "";
		
		switch(monat) {		
		case 1:
			monatsName = "Januar";
			break;
		case 2:
			monatsName = "Februar";
			break;
		case 3: 
			monatsName = "März";
			break;
		case 4:
		case 5:
		case 6:
			monatsName = "Sommer";
			break;
		case 7:
		case 8:
		case 9:
			monatsName = "Herbst";
			break;
		case 10:
			monatsName = "Oktober";
			break;
		case 11:
			monatsName = "November";
			break;
		case 12:
			monatsName = "Dezember";
			break;
		default:
			monatsName = "ungültige Eingabe";
		}

		System.out.println(monatsName);
	}

}
