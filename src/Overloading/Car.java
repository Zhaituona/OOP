package Overloading;

public class Car {
	
	public String infoOfCar(String a , int b) {
		String information = a + b;
		return information;
	}
	public int infoOfCar(int a , int b , int c ) {
		int information = a + b + c ;
		return information;
		
	}
	public String infoOfCar(int a , String b ) {
		String information = a + b ;
		return information;
	}
	public int infoOfCar(int a ,int b, int c , int d ) {
		int information= a + b + c + d;
		return information;
	}

}
