package modulo1;

import java.util.Scanner;

public class OperazioniAritmetiche {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        computeValues(a, b);
    }
 
    private static void computeValues(int a, int b) {
        
    	int somma = a + b;
    	int sottrazione = a - b;
    	int moltiplicazione = a * b;
    	float divisione = a / b;
    	
    	System.out.println("il risultato della somma è = " + somma);
    	System.out.println("il risultato della sottrazione è = " + sottrazione);
    	System.out.println("il risultato della moltiplicazione è = " + moltiplicazione);
    	System.out.println("il risultato della divisione è = " + divisione);

    }
    
       
}


