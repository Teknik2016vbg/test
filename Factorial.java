package syncgithub.test;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	/**
	 * Defined for 0<=n<=20
	 * @param n
	 * @return n!
	 */
	static long factorial(int n){
		long res=1;
		while(n>1){
			res*=n--;
		}
		return res;
	}
}
