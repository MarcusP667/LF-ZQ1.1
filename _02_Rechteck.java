package _01_Chapter;

import javax.swing.JOptionPane;

public class _02_Rechteck {

	public static void main(String[] args) {
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Laenge ein: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite ein: "));
		String masseinheit = JOptionPane.showInputDialog("Bitte geben Sie die Masseinheit ein: ");
		
		double flaeche = laenge * breite;
		double umfang = 2 * laenge + 2 * breite;
		
		JOptionPane.showMessageDialog(null, "Die eingegebene Laenge betraegt: " + laenge + masseinheit + "\n"
										  + "Die eingegebene Breite betraegt: " + breite + masseinheit + "\n\n"
										  + "Der Umfang betraegt: " + umfang + masseinheit + "\n"
										  + "Die Flaeche betraegt: " + flaeche + masseinheit + "²");
		
	}
}
