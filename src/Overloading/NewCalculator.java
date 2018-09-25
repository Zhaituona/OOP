package Overloading;

public class NewCalculator extends Calculator{
	
	public int areOfLand(int a , int b, int c, int d) {
		int total = a + b + c + d - 2;
		return total;
	}

}
