package p01_demo;

public class D13_Schleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Schleifenkopf
		// Startwert, Bedingung, Schrittweite
		// i++ -> i += 1 --> i = i + 1
		for(int i = 1; i <= 10; i++) {
		// Schleifenkörper	
			System.out.println("Durchlauf for:" +i);
		}
		
		for(int i = 25; i > 0; i--) {
			System.out.println("Schleife for: " +i);
		}
		
		int i = 1;
		// Schleifenkopf
		while(i <= 10) {
		//Schleifenkörper	
			System.out.println("Durchlauf while: " +i);
			i++;
		}
		
		boolean status = false;
		while(!status) {
			System.out.println("boolean");
		}

	}

}
