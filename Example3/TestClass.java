package Example3;



public class TestClass {

	public static void main(String[] args) {
		Vehical car = new Car(10);
		Vehical bicycle = new Bicycle(2);
		
		
		System.out.println("speed of car :");
		car.speedUp();
		
		System.out.println("speed of bicycle");
		bicycle.speedUp();

	}

}
