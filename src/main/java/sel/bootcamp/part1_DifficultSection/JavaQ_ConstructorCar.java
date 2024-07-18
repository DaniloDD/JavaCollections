package sel.bootcamp.part1_DifficultSection;

public class JavaQ_ConstructorCar {
    private String brand;
    private String model;
    private int year;

    // Constructor with parameters
    public JavaQ_ConstructorCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Constructor with default values
    public JavaQ_ConstructorCar() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects using constructors
    	JavaQ_ConstructorCar car1 = new JavaQ_ConstructorCar("Toyota", "Camry", 2022);
    	JavaQ_ConstructorCar car2 = new JavaQ_ConstructorCar();

        // Displaying information using instance method
        System.out.println("Car 1:");
        car1.displayInfo();
        System.out.println();

        System.out.println("Car 2:");
        car2.displayInfo();
    }
}
