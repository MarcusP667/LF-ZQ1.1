package _02_Chapter;

import javax.swing.*;
import java.util.Locale;

public class _04_DiscoEinlass {
    public static void main(String[] args) {
    	String istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder älter?").toLowerCase().trim();
    	
    	if(istAltGenug.equals("ja")) {
    		String istVIP = JOptionPane.showInputDialog("Bist du VIP?").toLowerCase().trim();
    		String istFrau = JOptionPane.showInputDialog("Bist du eine Frau?").toLowerCase().trim();
    		
    		if(istVIP.equals("ja") && istFrau.equals("ja")) {
    			JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco - viel Spaß in der VIP - Lounge!" 
    										+ "Heute ist Ladies Night. Du bekommst 15% Rabatt auf alle Getranke!");
    		} else if (istVIP.equals("ja")) {
    			JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco - viel Spaß in der VIP - Lounge!");
    		} else if (istFrau.equals("ja")) {
    			JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unsere Disco! Viel Spaß."
    											+	"Heute ist Ladies Night. Du bekommst 15% Rabatt auf alle Getranke!");
    		} else {
    			JOptionPane.showMessageDialog(null, "Herzlich Willkommen in der unsere Disco! Viel Spaß.");
    		}
    		
    	} else {
    		JOptionPane.showMessageDialog(null, "Du kommst hier nicht rein!");
    	}
    }
}
