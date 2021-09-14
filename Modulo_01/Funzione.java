package modulo1;

import java.util.Scanner;

public class Funzione {

	public static void main(String[] args) {
		/*
		 * Scrivete una funzione che dato in input un numero di secondi, restituisce una
		 * stringa che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("inserire un numero > ");
		long secondi = input.nextInt();
		tempo(secondi);

	}

	public static void tempo(long secondi) {

		long giorni = secondi / 86400;
		long rGiorni = secondi % 86400;
		long ore = rGiorni / 3600;
		long rOre = rGiorni % 3600;
		long minuti = rOre / 60;
		long rMinuti = rOre % 60;
		long secondiFinali = rMinuti;

		System.out.println("Giorni: " + giorni + " Ore: " + ore + " Minuti: " + minuti + " Secondi: " + secondiFinali);

	}
}
