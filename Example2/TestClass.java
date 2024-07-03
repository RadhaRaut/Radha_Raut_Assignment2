package Example2;


public class TestClass {

	public static void main(String[] args) {
		Animal bird = new Bird();
		Animal cat = new Cat();
		
		System.out.println("Bird sound : ");
		bird.Sound();
		
		System.out.println("Cat sound : ");
		cat.Sound();
	}

}
