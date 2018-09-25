package Encapsulation;

public class Students {
	
	private String stName;
	private int stID;
	private String Dob;
	
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStID() {
		return stID;
	}
	public void setStID(int stID) {
		this.stID = stID;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	
	private void getStudentGreade() {
		System.out.println("This student's grade is A");
	}
	public void display() {
		getStudentGreade();
		
	}

}
