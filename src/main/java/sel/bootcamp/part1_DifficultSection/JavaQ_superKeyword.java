package sel.bootcamp.part1_DifficultSection;

public class JavaQ_superKeyword {
	public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.displayInfo();
	}
}

class Animal {
    String name;
    
    // Constructor
    Animal(String name) {
        this.name = name;
    }
    
    // Method
    void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;
    
    // Constructor
    Dog(String name, String breed) {
        super(name); // Calling the superclass constructor
        this.breed = breed;
    }
    
    // Method
    @Override
    void displayInfo() {
        super.displayInfo(); // Calling the superclass method
        System.out.println("Breed: " + breed);
    }
    
    @Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
