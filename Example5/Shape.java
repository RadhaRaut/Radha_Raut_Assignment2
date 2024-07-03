package Example5;


public class Shape {
	public double getPerimeter() {
	return 0.0;
}

public double getArea() {
	return 0.0;
}

}

class Circle2 extends Shape {
private double radius;

public Circle2(double radius) {
	this.radius = radius;
}

@Override
public double getPerimeter() {

	return 2 * Math.PI * radius;
}

@Override
public double getArea() {

	return Math.PI * radius * radius;
}


}
