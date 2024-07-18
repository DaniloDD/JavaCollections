package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Method {
	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Calling methods and displaying results
        System.out.println("Addition: " + calculator.add(10, 5));        // Output: Addition: 15
        System.out.println("Subtraction: " + calculator.subtract(10, 5)); // Output: Subtraction: 5
        System.out.println("Multiplication: " + calculator.multiply(10, 5)); // Output: Multiplication: 50
        System.out.println("Division: " + calculator.divide(10, 5));     // Output: Division: 2.0
    }
}

class Calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}
