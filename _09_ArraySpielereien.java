
import java.util.Arrays;

public class _01_ArraySpielereien {
	
	public static void main(String[] args) {
		//Aufgabe 1
		int[] arr1 = new int[5];
		arr1[0] = 4;
		arr1[1] = 2;
		arr1[2] = 5;
		arr1[3] = 6;
		arr1[4] = 3;
		
		
		//Aufgab2
		System.out.println("arr1[2]: " + arr1[2]);
		System.out.println("arr1[4]: " + arr1[4]);
		
		System.out.println();
		
		//Aufgabe3
		arr1[3] = 12;
		System.out.println("arr1[3]: " + arr1[3]);
		
		System.out.println();
		
		//Aufgabe 4
		int[] arr2 = new int[] {3, 2, 5, 1, 10};
		//int[] arr2 = {3, 2, 5, 1, 10}; alternative Variante, kürzer
		
		System.out.println();
		
		//Aufgabe 5
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] ist " + arr2[i]);
		}
		
		System.out.println();
		
		//Aufgabe 6
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 0;
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] ist " + arr2[i]);
		}
		
		System.out.println();
		
		//Aufgabe 7
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 3);
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] ist " + arr3[i]);
		}
		
		System.out.println();
		
		//Aufgabe 8
		int[] arr4 = {8, 2, 12, 4, 6};
		Arrays.sort(arr4);
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] ist " + arr4[i]);
		}
		
		//Aufgabe 9
		String[] arr5 = {"Hans", "Heidi", "Fatimah"};
		
		Arrays.sort(arr5);
		
		int foundIndex = Arrays.binarySearch(arr5, "Fatimah");
		
		if(foundIndex >= 0) {
			System.out.println("Element an Stelle " + foundIndex + " gefunden.");
		} else System.out.println("Element nicht gefunden");
		
		System.out.println();
		
		
		//Aufgabe 10
		String[] arr6 = {"Hans", "Heidi", "Fatimah"};
		
		if(Arrays.equals(arr5, arr6) == true) {
			System.out.println("arr5 und arr6 sind gleich");
		} else System.out.println("arr5 und arr6 sind nicht gleich");
		
		Arrays.sort(arr6);
		
		if(Arrays.equals(arr5, arr6) == true) {
			System.out.println("arr5 und arr6 sind nach der Sortierung gleich");
		} else System.out.println("arr5 und arr6 sind nach der Sortierung nicht gleich");
		
		
		System.out.println();
		
		//Aufgabe11
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(String s : arr5) {
			System.out.print(s + " ");
		}
	}
	
}
