package p02_aufgaben;

import java.util.Scanner;

public class a_if_temperatur {

	public static void main(String[] args) {
		/*Schreibe ein Programm, das den Benutzer nach einer Temperatur in Celsius fragt. 
		 * Gib eine Meldung aus, ob es sich um gefährliche Kälte (< -20 Grad Celsius), 
		 * normale Kälte (-20 bis 0 Grad Celsius), normale Wärme (0 bis 30 Grad Celsius) 
		 * oder Hitze (> 30 Grad Celsius) handelt.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Temperatur?");
		
		int temperatur = scanner.nextInt();
		
		if(temperatur < -20) {
			System.out.println("gefährliche Kälte");
		}else if(temperatur >= -20 && temperatur < 0) {
			System.out.println("normale Kälte");
		}else if(temperatur >= 0 && temperatur <= 30) {
			System.out.println("normale Wärme");
		}else {
			System.out.println("Hitze");
		}
		
		scanner.close();
	}

}
