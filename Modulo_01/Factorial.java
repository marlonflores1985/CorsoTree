package modulo1;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

	private static long factorial(int n) {
		
			long factorial = 1;
			for ( int i = 1 ; i <= n ; i++ )
				factorial = factorial*i;
			System.out.println("Factoriale di "+n+" è = "+factorial);
			return factorial;
		
	}
 
    

}
