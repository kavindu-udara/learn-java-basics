package superKeyword;

public class Hero extends Person {
	String power;
	Hero(String name, int age, String power){
//		this -> this class
//		super -> parent class
		super(name, age);
		this.power=power;
	}
	
	public String toString() {
		return super.toString() + this.power;
	}
	
}
