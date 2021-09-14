package modulo1;

public class Palindroma {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }
 
    private static boolean isPalindrome(String s) {
    	boolean palindroma = true;
    	for(int sx = 0, dx = s.length()-1; sx < dx && palindroma; sx++,dx--)
		return false;
        //inserite qui il vostro codice
		return palindroma;
	}

}
