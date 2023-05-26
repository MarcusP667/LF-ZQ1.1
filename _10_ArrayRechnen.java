
import java.util.Arrays;

public class _02_ArrayRechnen {

	public static void main(String[] args) {
		int arrayEins[]= new int [5];
		arrayEins[0]=22;
		arrayEins[1]=2;
		arrayEins[2]=21;
		arrayEins[3]=18;
		arrayEins[4]=7;
		
		//1)
		for (int i : arrayEins) {
			System.out.print(i + " ");
		}
		
		//2)
		arrayEins[2] = arrayEins[2] * arrayEins[1];
		
		//3)
		arrayEins[0] /= arrayEins[3];
		
		System.out.println();
		
		//4)
		if(arrayEins[2] % arrayEins[4] == 0) {
			System.out.println("5. Element ist Teiler vom 3. Element");
		} else {
			System.out.println("5. Element ist nicht Teiler vom 3. Element");
		}
		
		//5
		for (int i : arrayEins) {
			System.out.print(i + " ");
		}
		
		
		System.out.println(Arrays.toString(arrayEins));

	}

}
