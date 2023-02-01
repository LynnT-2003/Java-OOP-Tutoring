package example;

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myPig = new Pig(); // Create a Pig object
		Animal myDog = new Dog(); // Create a Dog object
		makeSound(myAnimal);
		makeSound(myPig);
		makeSound(myDog);
	}
	public static void makeSound(Object o){
		if (o instanceof Animal) {
			((Animal) o).animalSound();
		} else {
			System.out.println(o + "It is not an instance of Animal");
		}
	}
}

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

