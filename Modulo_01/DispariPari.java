package modulo1;

import java.util.Arrays;

public class DispariPari {

	public static void main(String[] args) {

		int[] arrayDispari = { 1, 2, 3, 4, 5 };
		int[] newArrayPari = dispariPari(arrayDispari);
		System.out.println("Array dispari = " + Arrays.toString(arrayDispari));
		System.out.println("Array pari = " + Arrays.toString(newArrayPari));
	}

	public static int[] dispariPari(int[] arrayDispari) {
		int[] newArrayPari = new int[5];
		for (int i = 0; i < arrayDispari.length; i++) {
			int pari;
			if (arrayDispari[i] % 2 != 0) {
				pari = arrayDispari[i] * 2;
				newArrayPari[i] = pari;
			} else
				newArrayPari[i] = arrayDispari[i];
		}

		return newArrayPari;

	}
}
