package p01_demo;

import java.util.Scanner;

public class D10_Verzweigungen {

	public static void main(String[] args) {

		boolean schnee = true;
		boolean schneeSturm = true;
		int schneeMenge = 3;
		int temperatur;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Liegt Schnee? J/N");
		String eingabe = scanner.next();
		if(eingabe.equals("J")) {
			schnee = true;
		}else {
			schnee = false;
		}

		if (schnee) {
			// ! Negation aus true wird false
			// !true --> false bzw. !false --> true
			System.out.println("Schneesturm? J/N");
			eingabe = scanner.next();
			if(eingabe.equals("J")) {
				schneeSturm = true;
			}else {
				schneeSturm = false;
			}
			
			if (!schneeSturm) {
				System.out.println("Schneemenge in cm?");
				schneeMenge = scanner.nextInt();
				if (schneeMenge >= 5 && schneeMenge <= 10) {
					System.out.println("Schlitten");
				} else if (schneeMenge > 10) {
					System.out.println("Ski/ Snowboard");
				} else {
					System.out.println("Schneespaziergang");
				}
			} else {
				System.out.println("Sofa");
			}
		} else {
			System.out.println("Warte auf Schnee");
			System.out.println("Temperatur?");
			temperatur = scanner.nextInt();
			if(temperatur > 30) {
				System.out.println("Freibad");
			}else {
				System.out.println("Netflix");
			}
		}
	}
}
