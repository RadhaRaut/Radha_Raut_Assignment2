package Example10;
/*
 * Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). 
 * Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to 
 * describe how each bird flies and makes a sound.
 */

public abstract class Bird {
	  public abstract void fly();
	    public abstract void makeSound();
	}

	// Subclass: Eagle
	class Eagle extends Bird {
	    @Override
	    public void fly() {
	        System.out.println("Eagle flies high in the sky.");
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Eagle screeches.");
	    }
	}

	// Subclass: Hawk
	class Hawk extends Bird {
	    @Override
	    public void fly() {
	        System.out.println("Hawk flies swiftly.");
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Hawk cries.");
	    }
}
