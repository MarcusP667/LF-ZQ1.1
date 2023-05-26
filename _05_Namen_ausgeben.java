package _02_Chapter;

import javax.swing.JOptionPane;

public class _02_Namen_ausgeben {

	public static void main(String[] args) {
		
		String namen = JOptionPane.showInputDialog("Bitte gib einen Namen ein, der wiederholt werden soll.");
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte Anzahl der Wiederholungen eingeben."));
		
		
		String ausgabe = "";
		final int OBERE_GRENZE = 30;
		final int UNTERE_GRENZE = 0;
		
		while (anzahl > OBERE_GRENZE || anzahl < UNTERE_GRENZE) {
			JOptionPane.showMessageDialog(null, "Falsche Eingabe! Bitte eine Zahl groesser 0 oder kleiner 31.");	
			anzahl = Integer.parseInt(JOptionPane.showInputDialog("Falsche Eingabe! Bitte eine Zahl groesser 0 oder kleiner 31. \n " 
														+ "Bitte Anzahl der Wiederholungen eingeben."));
		}
		
		
		for(int i = 1; i <= anzahl; i++) {
			ausgabe += i + ": " + namen + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);	
	}
}
