package _03_Chapter;

import javax.swing.JOptionPane;

public class _04_Notendurchschnitt {

	public static void main(String[] args) {
		double summe = 0;
		//Anzahl Noten bestimmen
		int anzahlNoten = Integer.parseInt(JOptionPane.showInputDialog("Mit diesem Tool berechnen Sie Ihren Notendurchschnitt. \n"
																	+ "Bitte geben Sie die exakte Anzahl der Noten ein: "));
		String ausgabeNoten = "Ihre eingebenen Noten betragen: ";
		
		double[] arrNoten = new double[anzahlNoten];
		

		//Nutzereingaben der Noten
		for(int i = 0; i < arrNoten.length; i++) {
			arrNoten[i] = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie Ihre " + (i + 1) + ". Note ein: "));
			summe += arrNoten[i];
		}
		
		//Ausgabe basteln ohne Komma am Ende
		for(int i = 0; i < arrNoten.length; i++) {
			if(i == arrNoten.length - 1) ausgabeNoten += arrNoten[i];
			else ausgabeNoten += arrNoten[i] + ", ";
		}
		
//		JOptionPane.showMessageDialog(null, ausgabeNoten 
//				+ "\nIhr Notendurchschnitt betraegt: " + String.format("%.2f", (summe / anzahlNoten)));
		
		JOptionPane.showMessageDialog(null, ausgabeNoten 
				+ "\nIhr Notendurchschnitt betraegt: " + Math.round((summe /= anzahlNoten) * 100) / 100.0);
		
		//Math.round((durchschnitt /= anzahl) * 100) / 100.0)
	}

}
