package com.Example1;


public class TestClass {

	public static void main(String[] args) {
		 Shape rectangle = new Rectangle(5, 10);
	        Shape circle = new Circle(7);
	        Shape triangle = new Triangle(4, 8);

	        System.out.println("Area of the rectangle: " + rectangle.getArea());
	        System.out.println("Area of the circle: " + circle.getArea());
	        System.out.println("Area of the triangle: " + triangle.getArea());
	    }

	}


