package modulo1;

import java.util.Random;

public class ArrayGaussiana {

	public static void main(String[] args) {
		
		String[] random = {"Andrea","Marco","Melvin"};

        System.out.println(stringaCasuale1(random));
    }



    public static String stringaCasuale1(String[] random){

        int lunghezza = random.length; // lunghezza array random
        Random rand = new Random();
        int randomValue = rand.nextInt(lunghezza); // [0-2]
        double a = randomValue+rand.nextGaussian();
        int b= (int)Math.round(a);

        //if(a<0 && a>(lunghezza-1))
        if(a<0) {
            System.out.println("Valore non appartenente al range: " + a);
            //return random[0];
            b = 0;
            //return "Condizone non rispettata";

        }else if(a>lunghezza-1) {
            System.out.println("Valore non appartenente al range: " + a);
            //return random[2];
            b = lunghezza - 1;
            //return "Condizone non rispettata";
        }


        System.out.println("Numero approssimato: " + b);
        System.out.println("Valore Gaussiano: " + a);
        System.out.println ("Posizione Array " + randomValue);

        return random[b];
		
		/*int nTot = 150;
        int nTesta = 0;
        int nCroce = 0;

        for (int i = 0; i < nTot; i++) {
            if (booleanCasuale(30)) {
                System.out.print("T ");
                nTesta++;
            } else {
                System.out.print("C ");
                nCroce++;
            }
        }

        System.out.println();
        System.out.format("Testa: %4d (%.2f%%)%n", nTesta, nTesta * 100.0 / nTot);
        System.out.format("Croce: %4d (%.2f%%)%n", nCroce, nCroce * 100.0 / nTot);
    }

    private static boolean booleanCasuale(double probabilitaTrue) {
        if (probabilitaTrue < 0 || probabilitaTrue > 100) {
            throw new IllegalArgumentException("Parametro probabilitaTrue non valido: " + probabilitaTrue);
        }

        double v = Math.random() * 100;   // Valore tra 0 (incluso) e 100 (escluso)
        return v < probabilitaTrue;*/
	}

}
