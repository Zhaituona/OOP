package Encapsulation;

public class AppleProduct {
	
	private String Iphone;
	private String Ipad;
	private String Imac;
	
	public String getIphone() {
		return Iphone;
	}
	public void setIphone(String iphone) {
		Iphone = iphone;
	}
	public String getIpad() {
		return Ipad;
	}
	public void setIpad(String ipad) {
		Ipad = ipad;
	}
	public String getImac() {
		return Imac;
	}
	public void setImac(String imac) {
		Imac = imac;
	}
	private void getAppleProductName() {
		System.out.println("This is Iphone");
	}
	public void display() {
		getAppleProductName();
		
	}

}
	
