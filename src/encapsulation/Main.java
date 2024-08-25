package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car car = new Car("Chevrolet", "Camalo", 2021);
//		
//		car.setYear(2022);
//		
//		System.out.println(car.getMake());
//		System.out.println(car.getModel());
//		System.out.println(car.getYear());
		
//		car.year = 2022;
		
		Car car1 = new Car("Chevrolet", "Camalo", 2021);
//		Car car2 = new Car("Ford", "Mustang", 2022);
		
//		copy object
//		car2.copy(car1);
		Car car2 = new Car(car1);
		
	}

}
