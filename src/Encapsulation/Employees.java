package Encapsulation;

public class Employees {
	
	private String emName;
	private String emDob;
	private int emID;
	private String emGender;
	
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public String getEmDob() {
		return emDob;
	}
	public void setEmDob(String emDob) {
		this.emDob = emDob;
	}
	public int getEmID() {
		return emID;
	}
	public void setEmID(int emID) {
		this.emID = emID;
	}
	public String getEmGender() {
		return emGender;
	}
	public void setEmGender(String emGender) {
		this.emGender = emGender;
	}
	
	private void getEmLevel() {
		System.out.println("This is new employee");
	}
	public void display() {
		getEmLevel();
	}
	

}
