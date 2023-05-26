
import javax.swing.JOptionPane;

public class _01_Niederschlagsmenge {

	public static void main(String[] args) {
		double aprilWetter;
		double maiWetter;
		double juniWetter;
		double durchschnitt;
		
		final int ANZAHL_MONATE = 3;
		
		String aprilEingabe = JOptionPane.showInputDialog("Bitte Geben Sie das April Wetter an: ");
		String maiEingabe = JOptionPane.showInputDialog("Bitte Geben Sie das Mai Wetter an: ");
		String juniEingabe = JOptionPane.showInputDialog("Bitte Geben Sie das Juni Wetter an: ");
		
		aprilWetter = Double.parseDouble(aprilEingabe);
		maiWetter = Double.parseDouble(maiEingabe);
		juniWetter = Double.parseDouble(juniEingabe);
		
		durchschnitt = (aprilWetter + maiWetter + juniWetter) / ANZAHL_MONATE;
		
		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge: " + aprilWetter + "l/qm \n" + 
											"Die Niederschlagsmenge: " + maiWetter + "l/qm \n" + 
											"Die Niederschlagsmenge: " + juniWetter + "l/qm \n\n" + 
											"Die durchschnittliche Niederschlagsmenge beträgt: " + 
											String.format("%.2f", durchschnitt) + "l/qm");
	}
}
