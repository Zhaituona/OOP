package Overloading;

public class TestCar {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.infoOfCar(2010, "Year"));
		System.out.println(myCar.infoOfCar("Make", 2010));
		
		

	}

}
