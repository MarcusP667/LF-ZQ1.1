
import javax.swing.JOptionPane;

public class _08_KalorienZaehlen {

	public static void main(String[] args) {
		int[][] kalorientasche = 
			{
				{1000, 2000, 3000},
				{4000},
				{5000, 6000},
				{7000, 8000, 9000},
				{10000}
			};
		
		int tmpKalorie = 0;
		int meisteKalorie = 0;
		int personMeisteKalorie = 0;
		
		for(int i = 0; i < kalorientasche.length; i++) {
			for(int j = 0; j < kalorientasche[i].length; j++) {
				tmpKalorie += kalorientasche[i][j];
			}
			
			if(tmpKalorie > meisteKalorie) {
				meisteKalorie = tmpKalorie;
				personMeisteKalorie = i;
			}
			
			tmpKalorie = 0;
		}
		
		JOptionPane.showMessageDialog(null, "Der Expeditionsteilnehmer " + (personMeisteKalorie + 1) 
				 			+ " hat mit " + meisteKalorie + "kcal die meisten Kalorien.");
	}

}
