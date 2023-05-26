
import java.util.Arrays;

import javax.swing.JOptionPane;

public class _05_1_ArrayGroessAendern {

	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		final int NEW_LENGTH = Integer.parseInt(
				JOptionPane.showInputDialog("Please enter the amount by wich the array should be increased: "));
		
		String outputString = "New Array: ";
		
		arr = Arrays.copyOf(arr, NEW_LENGTH);
		

		String seperator = "";
		for(String i : arr) {
			outputString += seperator + " " + i;
			seperator = ", ";
		}
		
		
		JOptionPane.showMessageDialog(null, outputString);

	}

}
