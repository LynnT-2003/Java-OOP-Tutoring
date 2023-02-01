package errorexample;

public class Apple {
	String name;
	
	public Apple(String name) {
		this.name = name;
	}
	public void howtoEat() {
		System.out.println("make apple cyder");
	}

	public static void main(String[] args) {
		Apple obj1 = new Apple("Big_apple");
		obj1.howtoEat();

	}

}
