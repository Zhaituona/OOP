package Encapsulation;

public class TestStudents {

	public static void main(String[] args) {
		
		Students St1 = new Students();
		
		St1.setStName("Zana");
		St1.setStID(01);
		St1.setDob("01/28/1987");
		
		Students St2 = new Students();
		
		St2.setStName("Kamila");
		St2.setStID(03);
		St2.setDob("09/07/1990");
		
		St2.display();
		
		
		
		
		System.out.println(St1.getDob() + " " + St1.getStID()+ " "+ St1.getStName());
		System.out.println(St2.getStName()+ " "+ St2.getStID()+ " "+ St2.getDob());
	

	}
	

}
