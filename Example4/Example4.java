package Example4;

/*
 * Write a Java program to overload a add() method.
 */

public class Example4 {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		Example4 e1 = new Example4();
		System.out.println(e1.add(10, 20));

		Example4 e2 = new Example4();
		System.out.println(e2.add(020, 30, 50));

		Example4 e3 = new Example4();
		System.out.println(e3.add(24.5d, 87.4d));

	}
}
