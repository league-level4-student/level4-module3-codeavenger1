package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	
	public static String reverseString(String s) throws IllegalStateException {
		String reverse = "";
		
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		for (int i = s.length(); i < 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}
}
