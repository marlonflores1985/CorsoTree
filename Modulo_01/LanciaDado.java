package modulo1;

import java.util.Random;
import java.util.Scanner;

public class LanciaDado {

	public static void main(String[] args) {
		
				
		System.out.println("Il valore del dado è = " + "("+lanciaDado()+")");
	}
	public static int lanciaDado() {
		Random rand = new Random();
		int randomValue = rand.nextInt(6);
		int valoreDado = 1 + randomValue;
		return valoreDado;
	}

}
