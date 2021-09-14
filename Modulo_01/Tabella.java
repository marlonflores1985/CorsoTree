package modulo1;

import java.util.Arrays;
import java.util.Scanner;

public class Tabella {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Insert m: ");
		int m = input.nextInt();
		System.out.print("Insert n: ");
		int n = input.nextInt();
		System.out.println(Arrays.toString(tabella(n, m)));
	}

	public static int[] tabella(int n, int m) {
		
		int[] arrayM = new int[m];				
		for(int i = 0; i < arrayM.length; i++) {
			arrayM[i] = i* n;
		}
		return arrayM;

	}
}
