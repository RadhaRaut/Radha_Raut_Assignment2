package Example9;
/*
 * Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). 
 * Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
 *  to describe how each person eats and exercises.
 */

public abstract class Person {

	public abstract void eat();
    public abstract void exercise();
}

// Subclass: Athlete
class Athlete extends Person {
    @Override
    public void eat() {
        System.out.println("Athlete eats a high-protein diet.");
    }

    @Override
    public void exercise() {
        System.out.println("Athlete exercises daily.");
    }
}

// Subclass: LazyPerson
class LazyPerson extends Person {
    @Override
    public void eat() {
        System.out.println("Lazy person eats junk food.");
    }

    @Override
    public void exercise() {
        System.out.println("Lazy person rarely exercises.");
    }
}
