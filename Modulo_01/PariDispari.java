package modulo1;

import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        checkEvenOdd(number);
    }
 
    private static boolean checkEvenOdd(int number) {
        //inserite qui il vostro codice
    	
    	/*if(number % 2 != 0) {
    		System.out.println("il numero è primo");
    	}else {
    		System.out.println("il numero non è primo");
    	}*/
    	
    	if(number % 2 != 0) {
    		return true;
    	}
		    return false;
	}
//    private static void checkEvenOdd(int number) {
//    	boolean result = number % 2 != 0 ? true : false;
//    	System.out.println(result);
//    
//    }

}
