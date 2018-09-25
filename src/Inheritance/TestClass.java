package Inheritance;

public class TestClass {

	public static void main(String[] args) {
		ClassB classb = new ClassB();
		classb.methodB();
		classb.methodA();
		classb.methodC();
		
		ClassD classd = new ClassD();
		classd.methodC();
		classd.methodD();

		ClassE classe = new ClassE();
		classe.methodC();
		classe.methodE();
		
		ClassF classf =  new ClassF();
		classf.methodF();
		classf.methodC();

	}

}
