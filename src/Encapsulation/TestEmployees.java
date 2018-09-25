package Encapsulation;

public class TestEmployees {

	public static void main(String[] args) {
		
		Employees Em1 = new Employees();
		
		Em1.setEmName("Atima");
		Em1.setEmDob("09/05/1980");
		Em1.setEmID(98);
		Em1.setEmGender("Female");
		
		Employees Em2 = new Employees();
		Em2.setEmName("bahar");
		Em2.setEmDob("04/05/1990");
		Em2.setEmID(79);
		Em2.setEmGender("Male");
		
		Em2.display();
		
	
		
		System.out.println(Em1.getEmName()+ " "+ Em1.getEmDob()+ " "+ Em1.getEmID()+" "+ Em1.getEmGender());
		System.out.println(Em2.getEmName()+ " "+Em2.getEmDob()+" " + Em2.getEmID()+ " "+ Em2.getEmGender());
		// TODO Auto-generated method stub

	}

}
