package Example2;
/*
 * 	Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
 * Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
 */
public class Animal {
	public void Sound() {

	}

}

class Bird extends Animal {

	@Override
	public void Sound() {
		System.out.println("chrip chrip");
	}

}

class Cat extends Animal {

	@Override
	public void Sound() {
		System.out.println("meow meow");
	}

}
