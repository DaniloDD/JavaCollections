package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal; // Reference of type Animal

		myAnimal = new Dog("Cooper", "Labrador"); // Dog object assigned to Animal reference
		myAnimal.makeSound(); // Calls overridden method in Dog class

		myAnimal = new Cat("Teodora"); // Cat object assigned to Animal reference
		myAnimal.makeSound(); // Calls overridden method in Cat class
	}
}

//Subclass Cat extends Animal
class Cat extends Animal {
	Cat(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}
