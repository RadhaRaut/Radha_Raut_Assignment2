package Example6;
/*
 * Write a Java program to create a class called Vehicle with a method called drive().
 * Create a subclass called Car that overrides the drive() method to print 
 *"Repairing a car".
 */


public class Vehical {
	public void drive() {

		System.out.println("Drive the car");

	}
}

class Car1 extends Vehical {

	@Override
	public void drive() {

		System.out.println("Repairing a car");
	}
}
