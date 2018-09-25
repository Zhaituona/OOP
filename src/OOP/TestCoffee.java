package OOP;

public class TestCoffee {
	public static void main(String[]args) {
		
	
	
	Coffee myCoffee = new Mocha();
	myCoffee.getSmell();
	myCoffee.getTaste();

	
	
	Mocha GreenMocha = new Mocha();
	
	GreenMocha.getCoffee();
	GreenMocha.importCoffeetBean();
	GreenMocha.localCoffeeBean();
	
	Latte HotLatte = new Latte();
	
	HotLatte.getSmell();
	HotLatte.getTaste();
	
	GreenMocha.countMolecular();
	GreenMocha.chemicalFuction();
	GreenMocha.seeMolecular();
	
	HotLatte.chemicalFuction();
	HotLatte.countMolecular();
	HotLatte.seeMolecular();
	}
	
}
