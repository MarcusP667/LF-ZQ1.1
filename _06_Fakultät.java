package _02_Chapter;

import javax.swing.JOptionPane;

public class _03_Fakultät {
	
	public static void main(String[] args) {
		
		int eingabeZahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gebe eine Zahl zwischen 0 und 10 ein: "));
		int ergebnis = 1;
		
		String ausgabe = "Das Ergebnis der " + eingabeZahl + "! ist: "+ ergebnis;
		
		final int UNTERE_GRENZE = 0;
		final int OBERE_GRENZE = 10;
		
		while(eingabeZahl < UNTERE_GRENZE || eingabeZahl > OBERE_GRENZE) {
			eingabeZahl = Integer.parseInt(JOptionPane.showInputDialog("Fehler! Bitte gebe JETZT eine Zahl zwischen 0 und 10 ein: "));
		}
		
		if(eingabeZahl == 0 || eingabeZahl == 1) {
			JOptionPane.showMessageDialog(null, ausgabe);
		} else {
			for(int i = 1; i <= eingabeZahl; i++) {
				ergebnis *= i;
			}
			JOptionPane.showMessageDialog(null, "Das Ergebnis der " + eingabeZahl + "! ist: "+ ergebnis);
		}
	}
}
