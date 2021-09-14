package modulo1;

public class HarmonicSum {

	public static void main(String[] args) {

		System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3./2));
        System.out.println(harmonicSum(20) == (55835135./15519504));
    }

	private static double harmonicSum(int n) {
			double armonica = 0;
			for(double i = 1; i <=n; i++) {
				armonica += 1/i;
				System.out.println("La somma armonica di "+n+" è = "+armonica);
			}
		return armonica;
	}
 
   

}
