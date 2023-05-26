package _03_Chapter;

import javax.swing.JOptionPane;

public class _05_ArrayGroesseAendern {

	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		final int USR_AMOUNT = Integer.parseInt(
				JOptionPane.showInputDialog("Please enter the amount by wich the array should be increased: "));
		
		String outputString = "New Array: ";
		
		String[] tmpArray = new String[USR_AMOUNT + arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			tmpArray[i] = arr[i];
		}
		
		arr = tmpArray;
		
		
		String seperator = "";
		for(String i : arr) {
			outputString += seperator + " " + i;
			seperator = ", ";
		}
		
		
		JOptionPane.showMessageDialog(null, outputString);

	}

}
