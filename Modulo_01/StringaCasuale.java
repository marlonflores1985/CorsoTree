package modulo1;

import java.util.Random;

public class StringaCasuale {

	public static void main(String[] args) {
		
		Random Array = new Random();

        String[] randomArray = {"Giulia","Nicola","Vito","Marlon"};

        int lunghezzaArray = randomArray.length; 

        int valoreArray = Array.nextInt(lunghezzaArray); 

        System.out.println(StringaCasuale.stringaCasuale(randomArray,valoreArray));


    }

    public static String stringaCasuale(String[] random, int randomValue){

    	
        return random[randomValue];
	}

}
