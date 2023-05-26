package _02_Chapter;

import javax.swing.JOptionPane;

public class _01_Alphabet {

	public static void main(String[] args) {
		String ausgabe = "";
		
		for(int i = 65; i <= 90; i++) {
			ausgabe += (char)i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);
		
		
		
		String ausgabe2 = "";
		
		for(char c = 'A'; c <= 'Z'; c++) {
			ausgabe2 += c + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe2);

	}

}
