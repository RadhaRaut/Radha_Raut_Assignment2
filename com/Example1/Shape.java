package com.Example1;
/*
 * Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and 
 * Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */



interface Shape {
	
	double getArea();
	}

	// Implement the Rectangle class
	class Rectangle implements Shape {
		private double width;
		private double height;

		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		@Override
		public double getArea() {
			return width * height;
		}
	}

	// Implement the Circle class
	class Circle implements Shape {
		private double radius;

		public Circle(double radius) {
			this.radius = radius;
		}

		@Override
		public double getArea() {
			return Math.PI * radius * radius;
		}
	}

	// Implement the Triangle class
	class Triangle implements Shape {
		private double base;
		private double height;

		public Triangle(double base, double height) {
			this.base = base;
			this.height = height;
		}

		@Override
		public double getArea() {
			return 0.5 * base * height;
		}

	}


