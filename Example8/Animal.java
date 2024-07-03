package Example8;
/*
 * Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion 
 * and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
 */
public abstract class Animal {
	 public abstract void sound();
	}

	// Subclass: Lion
	class Lion extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Lion roars");
	    }
	}

	// Subclass: Tiger
	class Tiger extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Tiger growls");
	    }
}
