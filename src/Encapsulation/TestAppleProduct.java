package Encapsulation;

public class TestAppleProduct {

	public static void main(String[] args) {
		
		AppleProduct Ap1 = new AppleProduct();
		Ap1.setIphone("6 plus");
		Ap1.setIpad("IpadAir");
		Ap1.setImac("MacBook");
		
		System.out.println(Ap1.getIphone()+ " "+ Ap1.getIpad()+ " "+ Ap1.getImac());
		
		AppleProduct Ap2= new AppleProduct();
		Ap2.setIphone("XS");
		Ap2.setIpad("Ipad mini");
		Ap2.setImac("Mac Book Pro");
		
		Ap2.display();
		
		
		
		System.out.println(Ap2.getIphone()+ " "+ Ap2.getIpad()+ " "+ Ap2.getImac());
		
		

	}

}
