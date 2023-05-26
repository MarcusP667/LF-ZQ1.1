
import javax.swing.JOptionPane;

public class _03_ArrayMaxMin {
	
	public static void main(String[] args) {
		int[] zahlen = {5, 2 , 10, 9, 12, 3};
		int max = 0;
		int min = 0;
		String ausgabe = "";
		
		//Max herausfinden
		for (int i = 0; i < zahlen.length; i++) {
			if(zahlen[i] > max || max == 0) max = zahlen[i];
		}
		
		//min = max;
		
		//Min herausfinden
		for (int i = 0; i < zahlen.length; i++) {
			if(zahlen[i] < min || min == 0) min = zahlen[i];
		}
		
		
		for(int i : zahlen) {
			ausgabe += i + " ";
		}
		
		
		JOptionPane.showMessageDialog(null, "Der Such-Array betraegt: " + ausgabe 
										+ "\n\nDer Max - Wert betraegt: " + max 
										+ "\nDer Min - Wert betraegt: " + min);
			
		
	}

}
