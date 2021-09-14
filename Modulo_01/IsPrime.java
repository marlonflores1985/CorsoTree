package modulo1;

public class IsPrime {

	public static void main(String[] args) {
		int number = 0;
		System.out.println(isPrime(number));
		number = 1;
		System.out.println(isPrime(number));
		number = 2;
		System.out.println(isPrime(number));
		number = 17;
		System.out.println(isPrime(number));
		number = 631;
		System.out.println(isPrime(number));
		number = 634;
		System.out.println(!isPrime(number));
		number = 999;
		System.out.println(!isPrime(number));
		number = 997;
		System.out.println(isPrime(number));
	}

	private static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
