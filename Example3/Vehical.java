package Example3;
/*
 * Write a Java program to create a class Vehicle with a method called speedUp(). 
 * Create two sub classes Car and Bicycle Override the speedUp() method in each subclass to increase the vehicle's speed differently.
 */



public class Vehical {
	protected int speed;

	public Vehical(int speed) {
		super();
		this.speed = 0;
	}

	public void speedUp() {
		System.out.println("vehicle speed up");
	}

	// Method to get the current speed
	public int getSpeed() {
		return speed;
	}
}

class Car extends Vehical {

	public Car(int speed) {
		super(speed);

	}

	@Override
	public void speedUp() {
		speed += 10; // Increase speed by 10 for Car
		System.out.println("Car speeds up by 10 units. Current speed: " + speed);

	}

}

class Bicycle extends Vehical {
	public Bicycle(int speed) {
		super(speed);

	}

	public void speedUp() {
		speed += 2; // Increase speed by 2 for Bicycle
		System.out.println("Bicycle speeds up by 2 units. Current speed: " + speed);
	}
}
