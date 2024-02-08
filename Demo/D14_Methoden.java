package p01_demo;

public class D14_Methoden {

	// kein Übergabeparamter, kein Rückgabewert
	public static void renn() {
		System.out.println("Ich renne");
		System.out.println("ich renne weiter");
		System.out.println("Und renne immer noch!");
	}
	
	
	// mit Übergabeparameter, kein Rückgabewert
	public static void renn(String ort) {
		System.out.println("Ich renne nach " +ort);
	}
	
	public static void renn(String ort, int kilometer) {
		System.out.println("Ich renne nach " +ort + " Das sind " + kilometer + " Kilometer");
	}
	
	public static void renn(int kilometer, String ort) {
		System.out.println("Ich renne nach " +ort + " Das sind " + kilometer + " Kilometer");
	}
	
	
	// Rückgabewert, aber kein Übergabeparameter
	public static String renn2() {
		
		boolean alt = false;
		
		if(alt) {
			return "ich gehe";
		}else {
			return "Ich renne";
		}
		
	}
	
	// Rückgabewert und Übergabeparamter
	public static String renn2(int alter) {
		
		renn();
		
		boolean alt = false;
		
		if(alter > 25) {
			alt = true;
		}
		
		if(alt) {
			return "ich gehe am Krückstock, weil alter Sack";
		}else {
			return "Ich renne";
		}
		
	
		
	}
	
	public static int addiere(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}

	
	public static void main(String[] args) {
		/*renn();
		System.out.println("Ich rufe die Methode nochmal auf!");
		renn();
		renn("Berlin");
		renn("Hamburg", 678);
		renn("München", 457);
		renn();
		int ergebnis = addiere(15, 17);
		System.out.println(ergebnis +10);
		*/
		
		
		System.out.println(renn2(45));
		

	}

}
