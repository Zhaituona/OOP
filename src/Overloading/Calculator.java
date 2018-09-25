package Overloading;

public class Calculator {
	
	public int areOfLand(int a , int b ) {
		int total = a + b;
		return total;
		
	}
	public int areOfLand(int a , int b , int c ) {
		int total = a + b +c;
		return total;
	}
	public String areOfLand(String a , int b) {
		String total = a + " " + b;
		return total;
	}
	public int areOfLand(int a , int b, int c, int d) {
		int total = a = b + c + d;
		return total;
	}

}
