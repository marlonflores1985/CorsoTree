package modulo1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.print("Insert number: ");
		int numero = input.nextInt();*/
		int numero =10;
		fibonacci(numero);
	}

	public static void fibonacci(int numero) {

		int[] arrayFibonacci = new int[numero];
		arrayFibonacci[0] = 0;
		arrayFibonacci[1] = 1;
		for (int i = 2; i < arrayFibonacci.length; i++) {
			arrayFibonacci[i] = arrayFibonacci[i - 2] + arrayFibonacci[i - 1];
		}
		System.out.println("L'ennessimo elemento è: " + arrayFibonacci[numero-1]);
	}
}
