package methodOverriding;

public class Dog extends Animal {
	
//	overriding method
	@Override
	void speak() {
		System.out.println("The dog goes *bark*");
	}
	
}
