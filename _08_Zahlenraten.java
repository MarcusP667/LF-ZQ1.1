
import javax.swing.JOptionPane;

public class _05_Zahlenraten {

	public static void main(String[] args) {
		int zahl = 0; //umewandelte Ratezahl
		String ratezahl = "";
		
		int versuche = 0;
		boolean hatGewonnen = false;
		boolean hatAbgebrochen = false;
		
		final int MIN_RATEWERT = 1;
		final int MAX_RATEWERT = 30;
		
		final int ANZAHL_TIPP = 5;
		final int ANZAHL_ABBRUCHFRAGE = 10;
		final int ANZAHL_ABBRUCH = 30;
		
		JOptionPane.showMessageDialog(null, "Herzlich Willkommen zum Zahlenrate - Spiel! Viel Spaß beim Raten.");
		
		do {
			
			if(versuche > 0) {
				JOptionPane.showMessageDialog(null, "Deine Zahl war falsch! Bitte versuche es erneut.");
			}
			
			ratezahl = JOptionPane.showInputDialog("Bitte gib deine Zahl ein: ").trim();
			
			if(ratezahl.isBlank()) {
				JOptionPane.showMessageDialog(null, "Bitte gib eine Zahl ein!!!");
				
			} else {
				zahl = Integer.parseInt(ratezahl);
				versuche++;
				
				if(zahl >= MIN_RATEWERT && zahl <= MAX_RATEWERT && zahl % 5 == 0) hatGewonnen = true;
				
				if(!hatGewonnen) {
					switch(versuche) {
						case ANZAHL_TIPP: JOptionPane.showMessageDialog(null, "Kleiner Tipp: Die Zahl muss zwischen "
																			+ "1 und 30 liegen.");
										  break;
										  
						case ANZAHL_ABBRUCHFRAGE: String abbruch = JOptionPane.showInputDialog("Moechtest abbrechen? Antworte "
												+ "mit ja oder nein").toLowerCase().trim();
												if(abbruch.equals("ja")) hatAbgebrochen = true;
												break;
												
						case ANZAHL_ABBRUCH: JOptionPane.showMessageDialog(null, "Fuer deine Gesundheit wird das Spiel beendet." 
												+ "Starte es erneut, wenn du wieder spielen willst.");
												hatAbgebrochen = true;
					}
				}
			}
		} while (!hatGewonnen && !hatAbgebrochen);
		
		if(hatGewonnen) {
			JOptionPane.showMessageDialog(null, "Erfolgreich erraten! Bis zum naechsten mal!");
		} else {
			JOptionPane.showMessageDialog(null, "Leider nicht gewonnen. Bis zum naechsten mal.");
		}
	}
}
