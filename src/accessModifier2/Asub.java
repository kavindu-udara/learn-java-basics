package accessModifier2;
import accessModifier1.*;

public class Asub extends A {
//	default access modifier

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C c = new C();
//		System.out.println(c.publicMessage);
		
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage);
	}
}
