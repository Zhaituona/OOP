package Overloading;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.areOfLand(6, 8));
		System.out.println(cal.areOfLand("name", 8));
		System.out.println(cal.areOfLand(6, 8, 5, 2));



	NewCalculator cal2 = new NewCalculator();
	System.out.println(cal2.areOfLand(6, 8, 5, 2));
	System.out.println(cal2.areOfLand(6, 8));
	System.out.println(cal2.areOfLand(6, 8, 5));

}

}