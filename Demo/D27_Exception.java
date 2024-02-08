package p01_demo;

public class D27_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eingabe = "10.5.";
		
		double zahl;
		
		// try = probieren
		try {
			zahl = Double.parseDouble(eingabe);
		
		// catch = abfangen
		}catch (NumberFormatException fehler) {
			System.out.println("Eingabe war keine Zahl");
			System.out.println(fehler.getMessage());
		}

	}

}
