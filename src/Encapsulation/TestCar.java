package Encapsulation;

public class TestCar {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setCarBrand("Toyota");
		car1.setCarMake("Matrix");
		car1.setCarYear(2010);
		
		car1.display();
		car1.show();
		Car car2 = new Car();
		
		car2.setCarBrand("BMW");
		car2.setCarMake("X6");
		car2.setCarYear(2016);
		
		car2.display();
		
		car2.show();
		
		System.out.println(car1.getCarBrand()+ " "+ car1.getCarMake()+ " "+ car1.getCarYear());
		System.out.println(car2.getCarBrand()+ " "+ car2.getCarMake()+ " "+ car2.getCarYear());
		
		

	}

}
