package p02_aufgaben;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class A08_kreis {

	public static void main(String[] args) {
		double radius = 0.0;
		double flaeche = 0.0;
		double umfang = 0.0;
		double durchmesser;
		double PI = 3.1415;
		
		String eingabe = "";
		boolean korrekteEingabe = false;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		while(!korrekteEingabe) {
			eingabe = JOptionPane.showInputDialog("Radius:");
	
			
			try {
				
				eingabe = eingabe.replace(",", ".");
				radius = Double.parseDouble(eingabe);
				korrekteEingabe = true;
				
			}catch(Exception fehler) {
				
				JOptionPane.showMessageDialog(null, "Üngültige Eingabe, bitte eine Zahl eingeben!");
				
			}
	
		}
		// radius = Double.parseDouble(eingabe.replace(",", "."));
		
		
		flaeche = PI * radius * radius;
		umfang = 2 * PI * radius;
		durchmesser = 2 * radius;
		
		JOptionPane.showMessageDialog(null, "Radius: " + df.format(radius) 
											+ "\nFläche: " + df.format(flaeche) 
											+ "\nUmfang: " + df.format(umfang) 
											+ "\nDurchmesser: " + df.format(durchmesser));		

	}

}
