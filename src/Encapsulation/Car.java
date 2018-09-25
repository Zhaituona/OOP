package Encapsulation;

public class Car {
	
	private String carBrand;
	private String carMake;
	private int carYear;
	public String getNewCar;
	
	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	
	private void getCar() {
		System.out.println("This is my car");
	}
	public void display() {
		getCar();
	}
	private void getNewCar() {
		System.out.println("This is my new car");
	}
	
 
	public void show() {
		getNewCar();
	}

	

}
